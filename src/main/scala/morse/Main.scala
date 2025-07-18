package morse

import morse.InputHandler._
import morse.OutPutHandler._
import morse.Translator._

object Main extends App {

  printMenu()
  promptChoice()

  val choice = readUntilValid(readIntInput())

  val inputPrompt: String = choice match {
    case 1 => "Enter Morse code: "
    case 2 => "Enter English text: "
    case _ => throw new InvalidInputException(s"Invalid choice ($choice), select 1 or 2")
  }

  promptInput(inputPrompt)

  val input = readUntilValid(readStringInput().toUpperCase)

  val result = choice match {
    case 1 => translatorMtoE(input)
    case 2 => translatorEtoM(input)
  }

  printResult(result)
}
