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

package org.apache.celeborn.common.meta

import java.util
import java.util.concurrent.ConcurrentHashMap

import scala.collection.JavaConverters._

import org.apache.celeborn.common.protocol.PartitionLocation

class ShufflePartitionLocationInfo {
  type PartitionInfo = ConcurrentHashMap[Int, util.Set[PartitionLocation]]
  private val masterPartitionLocations = new PartitionInfo
  private val slavePartitionLocations = new PartitionInfo
  implicit val partitionOrdering: Ordering[PartitionLocation] = Ordering.by(_.getEpoch)

  def addMasterPartitions(masterLocations: util.List[PartitionLocation]) = {
    addPartitions(masterPartitionLocations, masterLocations)
  }

  def addSlavePartitions(slaveLocations: util.List[PartitionLocation]) = {
    addPartitions(slavePartitionLocations, slaveLocations)
  }

  def getMasterPartitions(partitionIdOpt: Option[Int] = None): util.Set[PartitionLocation] = {
    getPartitions(masterPartitionLocations, partitionIdOpt)
  }

  def getSlavePartitions(partitionIdOpt: Option[Int] = None): util.Set[PartitionLocation] = {
    getPartitions(slavePartitionLocations, partitionIdOpt)
  }

  def containsPartition(partitionId: Int): Boolean = {
    masterPartitionLocations.containsKey(partitionId) ||
    slavePartitionLocations.containsKey(partitionId)
  }

  def removeMasterPartitions(partitionId: Int): util.Set[PartitionLocation] = {
    removePartitions(masterPartitionLocations, partitionId)
  }

  def removeSlavePartitions(partitionId: Int): util.Set[PartitionLocation] = {
    removePartitions(slavePartitionLocations, partitionId)
  }

  private def removePartitions(
      partitionInfo: PartitionInfo,
      partitionId: Int): util.Set[PartitionLocation] = {
    val partitionLocations = partitionInfo.remove(partitionId)
    if (partitionLocations != null) {
      partitionLocations
    } else {
      new util.HashSet[PartitionLocation]()
    }
  }

  def getAllMasterLocationsWithMinEpoch(): util.Set[PartitionLocation] = {
    masterPartitionLocations.values().asScala.map { partitionLocations =>
      partitionLocations.asScala.min
    }.toSet.asJava
  }

  private def addPartitions(
      partitionInfo: PartitionInfo,
      locations: util.List[PartitionLocation]): Unit = synchronized {
    if (locations != null && locations.size() > 0) {
      locations.asScala.foreach { loc =>
        partitionInfo.computeIfAbsent(loc.getId, _ => ConcurrentHashMap.newKeySet())
        val partitionLocations = partitionInfo.get(loc.getId)
        if (partitionLocations != null) {
          partitionLocations.add(loc)
        }
      }
    }
  }

  private def getPartitions(
      partitionInfo: PartitionInfo,
      partitionIdOpt: Option[Int]): util.Set[PartitionLocation] = {
    partitionIdOpt match {
      case Some(partitionId) =>
        partitionInfo.getOrDefault(partitionId, new util.HashSet)
      case _ => partitionInfo.values().asScala.flatMap(_.asScala).toSet.asJava
    }
  }
}
