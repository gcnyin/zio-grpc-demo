package example

import scalapb.zio_grpc.{ServerMain, ServiceList}

object GreeterServer extends ServerMain {
  def services: ServiceList[Any] = ServiceList.add(GreeterImpl)
  override def port = 9000
}
