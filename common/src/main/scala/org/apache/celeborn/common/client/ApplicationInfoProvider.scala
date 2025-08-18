package org.apache.celeborn.common.client

import org.apache.celeborn.common.CelebornConf

abstract class ApplicationInfoProvider(conf: CelebornConf) {
  def provide(): Map[String, String]
}

object ApplicationInfoProvider {
  def instantiate(conf: CelebornConf): ApplicationInfoProvider = {
    val className = conf.applicationInfoProviderClass
    org.apache.celeborn.common.util.Utils.instantiateClassWithCelebornConf[ApplicationInfoProvider](className, conf)
  }
}
