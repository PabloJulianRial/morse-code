package morse
import morse.InputHandler._
import morse.OutPutHandler._
import morse.Translator._
import morse.MorseCode._
object Main extends App {

  printMenu()
  promptChoice()
  val choice = readIntInput()

  val inputPrompt = choice match {
    case 1 => "Enter Morse code: "
    case 2 => "Enter English text: "
    case _ =>
      throw new InvalidInputException(s"Invalid choice ($choice), select 1 or 2")
  }
  def wrongStringInput():String = {
    println("Sorry, that is neither a valid Morse Code String or an English String")
    readStringInput().toUpperCase
  }

  promptInput(inputPrompt)
  val input = readStringInput().toUpperCase
  
  def checkValidInput(inputString: String):Boolean = {
  inputString match {
    case inputString if inputString.forall(ch => englishToMorse.contains(ch)) => true
    case inputString if inputString.split("\\s+").forall(ch => morseToEnglish.contains(ch)) => true
    case _ => false
     }
  }
  
  if(!checkValidInput(input)) {
    println("Sorry, that is neither valid English nor valid Morse.")
    promptInput(inputPrompt)
    val input = readStringInput().toUpperCase
  }
  //val unwrappedInput:String = input.getOrElse(wrongStringInput())

  val result = choice match {
    case 1 => translatorMtoE(input)
    case 2 => translatorEtoM(input)
  }

  printResult(result)


}
