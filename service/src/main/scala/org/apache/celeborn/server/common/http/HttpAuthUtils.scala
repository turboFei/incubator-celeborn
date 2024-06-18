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

package org.apache.celeborn.server.common.http

object HttpAuthUtils {
  // HTTP header used by the server endpoint during an authentication sequence.
  val WWW_AUTHENTICATE_HEADER = "WWW-Authenticate"
  // HTTP header used by the client endpoint during an authentication sequence.
  val AUTHORIZATION_HEADER = "Authorization"
  // HTTP header prefix used by the SPNEGO client/server endpoints during an
  // authentication sequence.
  val NEGOTIATE = "Negotiate"
  // HTTP header prefix used during the Basic authentication sequence.
  val BASIC = "Basic"

}
