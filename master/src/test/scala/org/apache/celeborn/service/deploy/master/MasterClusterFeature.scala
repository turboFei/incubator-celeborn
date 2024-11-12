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

package org.apache.celeborn.service.deploy.master

import java.io.IOException
import java.net.BindException

import org.apache.celeborn.common.CelebornConf
import org.apache.celeborn.common.internal.Logging
import org.apache.celeborn.common.util.{CelebornExitKind, Utils}
import org.apache.celeborn.common.util.Utils.selectRandomInt

trait MasterClusterFeature extends Logging {
  var masterInfo: (Master, Thread) = _
  val maxRetries = 3

  class RunnerWrap[T](code: => T) extends Thread {

    override def run(): Unit = {
      Utils.tryLogNonFatalError(code)
    }
  }

  def withSetupMasterRetry(f: () => Unit): Unit = {
    var retryCount = 0
    var pass = false
    while (!pass) {
      try {
        f()
        pass = true
      } catch {
        case e: IOException
          if e.isInstanceOf[BindException] || Option(e.getCause).exists(
            _.isInstanceOf[BindException]) =>
          logError(s"UT failed to BindException, retrying (retry count: $retryCount)", e)
          retryCount += 1
          if (retryCount == maxRetries) {
            logError("failed to pass UT, reached the max retry count", e)
            throw e
          }
      }
    }
  }

  def setupMasterWithRandomPort(masterConf: Map[String, String] = Map()): Master = {
    var retryCount = 0
    var created = false
    var master: Master = null
    while (!created) {
      try {
        val randomPort = selectRandomInt(1024, 65535)
        val randomInternalPort = selectRandomInt(1024, 65535)
        val finalMasterConf = Map(
          s"${CelebornConf.MASTER_HOST.key}" -> "localhost",
          s"${CelebornConf.PORT_MAX_RETRY.key}" -> "0",
          s"${CelebornConf.MASTER_PORT.key}" -> s"$randomPort",
          s"${CelebornConf.MASTER_ENDPOINTS.key}" -> s"localhost:$randomPort",
          s"${CelebornConf.MASTER_INTERNAL_PORT.key}" -> s"$randomInternalPort",
          s"${CelebornConf.MASTER_INTERNAL_ENDPOINTS.key}" -> s"localhost:$randomInternalPort") ++
          masterConf
        master = setUpMaster(masterConf = finalMasterConf)
        created = true
      } catch {
        case e: IOException
            if e.isInstanceOf[BindException] || Option(e.getCause).exists(
              _.isInstanceOf[BindException]) =>
          logError(s"failed to setup master, retrying (retry count: $retryCount)", e)
          retryCount += 1
          if (retryCount == 3) {
            logError("failed to setup master, reached the max retry count", e)
            throw e
          }
      }
    }
    master
  }

  private def createMaster(map: Map[String, String] = null): Master = {
    val conf = new CelebornConf()
    conf.set(CelebornConf.METRICS_ENABLED.key, "false")
    val httpPort = selectRandomInt(1024, 65535)
    conf.set(CelebornConf.MASTER_HTTP_PORT.key, s"$httpPort")
    logInfo(s"set ${CelebornConf.MASTER_HTTP_PORT.key} to $httpPort")
    if (map != null) {
      map.foreach(m => conf.set(m._1, m._2))
    }

    val masterArguments = new MasterArguments(Array(), conf)
    val master = new Master(conf, masterArguments)
    master.startHttpServer()

    Thread.sleep(5000L)
    master
  }

  def setUpMaster(masterConf: Map[String, String] = null): Master = {
    val timeout = 30000
    val master = createMaster(masterConf)
    val masterStartedSignal = Array(false)
    val masterThread = new RunnerWrap({
      try {
        masterStartedSignal(0) = true
        master.rpcEnv.awaitTermination()
      } catch {
        case ex: Exception =>
          masterStartedSignal(0) = false
          throw ex
      }
    })
    masterThread.start()
    masterInfo = (master, masterThread)
    var masterStartWaitingTime = 0
    Thread.sleep(5000)
    while (!masterStartedSignal.head) {
      logInfo("waiting for master node starting")
      masterStartWaitingTime += 5000
      if (masterStartWaitingTime >= timeout) {
        throw new BindException("cannot start master rpc endpoint")
      }
    }
    master
  }

  def shutdownMaster(): Unit = {
    masterInfo._1.stop(CelebornExitKind.EXIT_IMMEDIATELY)
    masterInfo._1.rpcEnv.shutdown()
    Thread.sleep(3000)
    masterInfo._2.interrupt()
  }
}
