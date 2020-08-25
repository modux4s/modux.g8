package $package$

import modux.core.api.{ModuleX, Service}
import modux.model.context.Context

case class ModuleRegister(context: Context) extends ModuleX {
  override def providers: Seq[Service] = Seq(
    
  )
}

