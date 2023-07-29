package example

import hello.helloworld.ZioHelloworld.ZGreeter
import hello.helloworld.{HelloReply, HelloRequest}
import io.grpc.StatusException
import zio.{IO, ZIO}

object GreeterImpl extends ZGreeter[Any] {
  override def sayHello(request: HelloRequest, context: Any): IO[StatusException, HelloReply] =
    ZIO.succeed(HelloReply(response = request.request))
}
