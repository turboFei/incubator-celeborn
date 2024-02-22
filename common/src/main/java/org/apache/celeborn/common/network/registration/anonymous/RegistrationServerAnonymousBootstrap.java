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

package org.apache.celeborn.common.network.registration.anonymous;

import io.netty.channel.Channel;

import org.apache.celeborn.common.network.sasl.ApplicationRegistry;
import org.apache.celeborn.common.network.server.BaseMessageHandler;
import org.apache.celeborn.common.network.server.TransportServerBootstrap;
import org.apache.celeborn.common.network.util.TransportConf;

public class RegistrationServerAnonymousBootstrap implements TransportServerBootstrap {
  private final TransportConf conf;
  private final ApplicationRegistry applicationRegistry;

  public RegistrationServerAnonymousBootstrap(
      TransportConf conf, ApplicationRegistry applicationRegistry) {
    this.conf = conf;
    this.applicationRegistry = applicationRegistry;
  }

  @Override
  public BaseMessageHandler doBootstrap(Channel channel, BaseMessageHandler rpcHandler) {
    return new RegistrationAnonymousRpcHandler(conf, channel, rpcHandler, applicationRegistry);
  }
}
