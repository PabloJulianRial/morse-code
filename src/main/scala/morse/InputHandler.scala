package morse
import scala.io.StdIn._

object InputHandler{


  def readStringInput(): String =
    readLine()

   def readIntInput(): Int =
     readLine().toInt
}

class InvalidInputException(e: String) extends Exception(e)