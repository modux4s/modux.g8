package $package$

import modux.core.api.{ModuleX, Service}
import modux.model.context.Context
import $package$.services.$service$

case class $module;format="Camel"$(context: Context) extends ModuleX {
  override def providers: Seq[Service] = Seq(
    $service;format="Camel"$(context)
  )
}

