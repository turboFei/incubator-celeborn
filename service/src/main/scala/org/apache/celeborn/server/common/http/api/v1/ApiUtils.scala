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

package org.apache.celeborn.server.common.http.api.v1

import java.util.concurrent.TimeUnit

import scala.collection.JavaConverters._

import org.apache.celeborn.common.meta.{WorkerInfo, WorkerStatus}
import org.apache.celeborn.common.protocol.PartitionLocation
import org.apache.celeborn.common.protocol.PbWorkerStatus.State
import org.apache.celeborn.rest.v1.model._
import org.apache.celeborn.rest.v1.model.PartitionLocationData.{ModeEnum, StorageEnum}

object ApiUtils {
  def workerData(workerInfo: WorkerInfo): WorkerData = {
    val (diskInfos, slots) =
      if (workerInfo.diskInfos == null) {
        Map.empty[String, String] -> 0L
      } else {
        workerInfo.diskInfos.asScala.map { case (disk, diskInfo) =>
          disk -> diskInfo.toString()
        }.toMap -> workerInfo.usedSlots()
      }
    val userResourceConsumption =
      if (workerInfo.userResourceConsumption == null) {
        Map.empty[String, String]
      } else {
        workerInfo.userResourceConsumption.asScala.map { case (user, resourceConsumption) =>
          user.toString -> resourceConsumption.toString()
        }.toMap
      }

    new WorkerData()
      .host(workerInfo.host)
      .rpcPort(workerInfo.rpcPort)
      .pushPort(workerInfo.pushPort)
      .fetchPort(workerInfo.fetchPort)
      .replicatePort(workerInfo.replicatePort)
      .internalPort(workerInfo.internalPort)
      .slotUsed(slots)
      .lastHeartbeatTimestamp(workerInfo.lastHeartbeat)
      .heartbeatElapsedSeconds(TimeUnit.MILLISECONDS.toSeconds(
        System.currentTimeMillis() - workerInfo.lastHeartbeat))
      .diskInfos(diskInfos.asJava)
      .resourceConsumption(userResourceConsumption.asJava)
      .workerRef(Option(workerInfo.endpoint).map(_.toString).orNull)
      .workerState(workerInfo.workerStatus.getState.toString)
      .workerStateStartTime(workerInfo.workerStatus.getStateStartTime)
  }

  def workerInfoResponse(
      workerInfo: WorkerInfo,
      currentStatus: WorkerStatus,
      isShutdown: Boolean,
      isRegistered: Boolean): WorkerInfoResponse = {
    val workerData = ApiUtils.workerData(workerInfo)
    new WorkerInfoResponse()
      .host(workerData.getHost)
      .rpcPort(workerData.getRpcPort)
      .pushPort(workerData.getPushPort)
      .fetchPort(workerData.getFetchPort)
      .replicatePort(workerData.getReplicatePort)
      .internalPort(workerData.getInternalPort)
      .slotUsed(workerData.getSlotUsed)
      .lastHeartbeatTimestamp(workerData.getLastHeartbeatTimestamp)
      .heartbeatElapsedSeconds(workerData.getHeartbeatElapsedSeconds)
      .diskInfos(workerData.getDiskInfos)
      .resourceConsumption(workerData.getResourceConsumption)
      .workerRef(workerData.getWorkerRef)
      .workerState(currentStatus.getState.toString)
      .workerStateStartTime(currentStatus.getStateStartTime)
      .isShutdown(isShutdown)
      .isRegistered(isRegistered)
      .isDecommissioning(
        isShutdown && (
          currentStatus.getState == State.InDecommission ||
            currentStatus.getState == State.InDecommissionThenIdle))
  }

  def partitionLocationData(partitionLocation: PartitionLocation): PartitionLocationData = {
    new PartitionLocationData()
      .idEpoch(partitionLocation.getId + "-" + partitionLocation.getEpoch)
      .hostAndPorts(partitionLocation.hostAndPorts())
      .mode(ModeEnum.fromValue(partitionLocation.getMode.toString))
      .peer(Option(partitionLocation.getPeer).map(_.hostAndPorts()).orNull)
      .storage(StorageEnum.fromValue(partitionLocation.getStorageInfo.toString))
      .mapIdBitMap(partitionLocation.getMapIdBitMap.toString)
  }
}
