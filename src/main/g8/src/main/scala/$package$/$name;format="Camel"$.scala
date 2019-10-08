package $package$

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl._

object $name;format="Camel"$ extends App {
  implicit val system = ActorSystem("default")
  implicit val materializer = ActorMaterializer()
  implicit val ec = system.dispatcher

  // Your code here
}
