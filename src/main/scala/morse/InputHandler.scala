package morse

import scala.io.StdIn._
import morse.MorseCode._

object InputHandler {
  class InvalidInputException(msg: String) extends Exception(msg)

  def readStringInput(): String =
    readLine()
  def readIntInput(): Int =
    readLine().toInt
  def wrongStringInput(): String = {
    println("Sorry, that is neither a valid Morse Code String or an English String")
    readStringInput().toUpperCase
  }
  def checkValidInput(inputString: String): Boolean = inputString match {
    case s if s.forall(ch => englishToMorse.contains(ch)) => true
    case s if s.split("\\s+").forall(tok => morseToEnglish.contains(tok)) => true
    case _ => false
  }
  def readUntilValid(initial: String): String = {
    if (checkValidInput(initial)) initial
    else {
      val retry = wrongStringInput()
      readUntilValid(retry)
    }
  }
}