package org.apache.celeborn.common.client

import org.apache.celeborn.common.CelebornConf
import org.apache.celeborn.common.util.Utils
abstract class ApplicationInfoProvider(conf: CelebornConf) {
  def provide(): Map[String, String]
}

object ApplicationInfoProvider {
  def instantiate(conf: CelebornConf): ApplicationInfoProvider = {
    val className = conf.clientApplicationInfoProvider
    Utils.instantiateClassWithCelebornConf[ApplicationInfoProvider](className, conf)
  }
}
