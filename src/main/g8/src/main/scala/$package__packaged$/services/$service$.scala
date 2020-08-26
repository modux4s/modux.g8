package $package$.services

import modux.core.api.Service
import modux.macros.serializer.codec.Codec
import modux.model.ServiceDef
import modux.model.context.Context
import modux.model.service.Call
import modux.macros.serializer.SerializationSupport

case class $service$(context: Context) extends Service with SerializationSupport {

  override def serviceDef: ServiceDef = {

    namedAs("$service;format="Camel"$")
      .withCalls(
        // use get, post, etc ...
      )
  }
}
