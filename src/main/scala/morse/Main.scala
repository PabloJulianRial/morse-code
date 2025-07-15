package morse
import morse.InputHandler._
import morse.OutPutHandler._
import morse.Translator._

object Main extends App {

  printMenu()
  promptChoice()
  val choice = readIntInput()
  val inputPrompt = {
    if (choice == 1) "Enter Morse code: "
    else if (choice == 2) "Enter English text: "
    else throw new InvalidInputException(s"Invalid choice ($choice), select 1 or 2")
  }
  promptInput(inputPrompt)
  val input = readStringInput().toUpperCase

  val result = choice match {
    case 1 => translatorMtoE(input)
    case 2 => translatorEtoM(input)
  }

  printResult(result)

 
}
