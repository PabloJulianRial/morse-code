package morse

import morse.InputHandler._
import morse.OutPutHandler._
import morse.Translator._

object Main extends App {

  printMenu()
  promptChoice()
  val choice = readIntInput()

  val inputPrompt = choice match {
    case 1 => "Enter Morse code: "
    case 2 => "Enter English text: "
    case _ => throw new InvalidInputException(s"Invalid choice ($choice), select 1 or 2")
  }

  promptInput(inputPrompt)
  val firstInput = readStringInput().toUpperCase

  val input = readUntilValid(firstInput)

  val result = choice match {
    case 1 => translatorMtoE(input)
    case 2 => translatorEtoM(input)
  }

  printResult(result)
}
