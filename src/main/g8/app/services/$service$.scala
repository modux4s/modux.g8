package services

import modux.core.api.Service
import modux.macros.serializer.SerializationSupport
import modux.model.ServiceDef
import modux.model.service.Call

class $service$ extends Service with SerializationSupport {

  def helloWorld(): Call[Unit, String] = onCall{
    "Hello world!!"
  }

  override def serviceDef: ServiceDef = {

    namedAs("$service;format="Camel"$")
      .entry(
        get("/hello", helloWorld _),
        statics("/app", "public/")
      )
  }
}
