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

package org.apache.celeborn.service.deploy.worker.http.api.v1

import javax.ws.rs.{Path, POST}
import javax.ws.rs.core.MediaType

import io.swagger.v3.oas.annotations.media.{Content, Schema}
import io.swagger.v3.oas.annotations.responses.ApiResponse

import org.apache.celeborn.server.common.http.api.ApiRequestContext
import org.apache.celeborn.server.common.http.v1.model.{HandleResponse, WorkerExitRequest}

@Path("/api/v1")
class ApiV1WorkerResource extends ApiRequestContext {
  @Path("shuffles")
  def shuffles: Class[ShuffleResource] = classOf[ShuffleResource]

  @Path("applications")
  def applications: Class[ApplicationResource] = classOf[ApplicationResource]

  @Path("workers")
  def workers: Class[WorkerResource] = classOf[WorkerResource]

  @ApiResponse(
    responseCode = "200",
    content = Array(new Content(
      mediaType = MediaType.APPLICATION_JSON,
      schema = new Schema(
        implementation = classOf[HandleResponse]))),
    description =
      "Trigger this worker to exit. Legal exit types are 'Decommission', 'Graceful' and 'Immediately'.")
  @POST
  @Path("exit")
  def exit(request: WorkerExitRequest): HandleResponse = {
    new HandleResponse().success(true)
      .message(httpService.exit(request.getType.toString))
  }
}
