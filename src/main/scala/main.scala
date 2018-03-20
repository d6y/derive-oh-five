object Main {

  import io.circe.generic.auto._
  import io.circe.syntax._

  case class Person(name: String)

  def main(args: Array[String]): Unit = 
    println(Person("bob").asJson)

}
