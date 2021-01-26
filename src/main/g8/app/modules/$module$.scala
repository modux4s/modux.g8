package modules

import modux.core.api.{ModuleX, Service}
import services.$service$

class $module$ extends ModuleX {
  override def providers: Seq[Service] = Seq(
    wire[$service$]
  )
}

