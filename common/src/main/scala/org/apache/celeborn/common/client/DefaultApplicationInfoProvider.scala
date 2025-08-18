package org.apache.celeborn.common.client

import org.apache.celeborn.common.CelebornConf

class DefaultApplicationInfoProvider(conf: CelebornConf) extends ApplicationInfoProvider(conf) {
  override def provide(): Map[String, String] = {
    conf.clientApplicationExtraInfo
  }
}
