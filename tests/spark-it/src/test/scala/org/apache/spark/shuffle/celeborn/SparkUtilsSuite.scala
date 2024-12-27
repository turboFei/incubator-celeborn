/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.shuffle.celeborn

import java.io.File
import java.util.Optional
import java.util.concurrent.atomic.AtomicBoolean

import org.apache.spark.{SparkConf, TaskContext}
import org.apache.spark.scheduler.TaskSchedulerImpl
import org.apache.spark.shuffle.ShuffleHandle
import org.apache.spark.sql.SparkSession
import org.scalatest.BeforeAndAfterEach
import org.scalatest.concurrent.Eventually.eventually
import org.scalatest.concurrent.Futures.{interval, timeout}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.time.SpanSugar.convertIntToGrainOfTime

import org.apache.celeborn.client.ShuffleClient
import org.apache.celeborn.common.CelebornConf
import org.apache.celeborn.common.protocol.ShuffleMode
import org.apache.celeborn.tests.spark.SparkTestBase

class SparkUtilsSuite extends AnyFunSuite
  with SparkTestBase
  with BeforeAndAfterEach {

  override def beforeEach(): Unit = {
    ShuffleClient.reset()
  }

  override def afterEach(): Unit = {
    System.gc()
  }

  test("check if fetch failure task another attempt is running or successful") {
    val sparkConf = new SparkConf().setAppName("rss-demo").setMaster("local[2,3]")
    val sparkSession = SparkSession.builder()
      .config(updateSparkConf(sparkConf, ShuffleMode.HASH))
      .config("spark.sql.shuffle.partitions", 2)
      .config("spark.celeborn.shuffle.forceFallback.partition.enabled", false)
      .config("spark.celeborn.client.spark.fetch.throwsFetchFailure", "true")
      .config(
        "spark.shuffle.manager",
        "org.apache.spark.shuffle.celeborn.TestCelebornShuffleManager")
      .getOrCreate()

    val celebornConf = SparkUtils.fromSparkConf(sparkSession.sparkContext.getConf)
    val hook = new ShuffleReaderGetHook(celebornConf)
    TestCelebornShuffleManager.registerReaderGetHook(hook)

    try {
      val sc = sparkSession.sparkContext
      val jobThread = new Thread {
        override def run(): Unit = {
          try {
            val value = Range(1, 10000).mkString(",")
            sc.parallelize(1 to 10000, 2)
              .map { i => (i, value) }
              .groupByKey(10)
              .mapPartitions { iter =>
                Thread.sleep(3000)
                iter
              }.collect()
          } catch {
            case _: InterruptedException =>
          }
        }
      }

      SparkUtils.firstReportedShuffleFetchFailureTaskId = Optional.empty();

      jobThread.start()

      val taskScheduler = sc.taskScheduler.asInstanceOf[TaskSchedulerImpl]
      eventually(timeout(30.seconds), interval(100.milliseconds)) {
        assert(hook.executed.get() == true)
        assert(SparkUtils.firstReportedShuffleFetchFailureTaskId.isPresent)
        val reportedTaskId = SparkUtils.firstReportedShuffleFetchFailureTaskId.get()
        val taskSetManager = SparkUtils.getTaskSetManager(taskScheduler, reportedTaskId)
        assert(taskSetManager != null)
        assert(SparkUtils.getTaskAttempts(taskSetManager, reportedTaskId)._2.size() == 1)
        assert(!SparkUtils.taskAnotherAttemptRunningOrSuccessful(reportedTaskId))
      }

      sparkSession.sparkContext.cancelAllJobs()

      jobThread.interrupt()

      eventually(timeout(3.seconds), interval(100.milliseconds)) {
        assert(SparkUtils.reportedStageShuffleFetchFailureTaskIds.size() == 0)
      }
    } finally {
      sparkSession.stop()
    }
  }

  class ShuffleReaderGetHook(conf: CelebornConf) extends ShuffleManagerHook {
    var executed: AtomicBoolean = new AtomicBoolean(false)
    val lock = new Object

    override def exec(
        handle: ShuffleHandle,
        startPartition: Int,
        endPartition: Int,
        context: TaskContext): Unit = {
      if (executed.get() == true) return

      lock.synchronized {
        handle match {
          case h: CelebornShuffleHandle[_, _, _] => {
            val appUniqueId = h.appUniqueId
            val shuffleClient = ShuffleClient.get(
              h.appUniqueId,
              h.lifecycleManagerHost,
              h.lifecycleManagerPort,
              conf,
              h.userIdentifier,
              h.extension)
            val celebornShuffleId = SparkUtils.celebornShuffleId(shuffleClient, h, context, false)
            val allFiles = workerDirs.map(dir => {
              new File(s"$dir/celeborn-worker/shuffle_data/$appUniqueId/$celebornShuffleId")
            })
            val datafile = allFiles.filter(_.exists())
              .flatMap(_.listFiles().iterator).headOption
            datafile match {
              case Some(file) => file.delete()
              case None => throw new RuntimeException("unexpected, there must be some data file" +
                  s" under ${workerDirs.mkString(",")}")
            }
          }
          case _ => throw new RuntimeException("unexpected, only support RssShuffleHandle here")
        }
        executed.set(true)
      }
    }
  }
}
