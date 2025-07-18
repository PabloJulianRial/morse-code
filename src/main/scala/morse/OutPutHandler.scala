package morse

object OutPutHandler {

  def printMenu(): Unit = {
    println("Welcome to my Morse Code Translator")
    println("1) Morse → English")
    println("2) English → Morse")
  
  }

  def promptChoice(): Unit =
    print("Select the kind of translation (1 or 2) and press ENTER: ")

  def promptInput(prompt: String): Unit =
    println(prompt)

  def printResult(result: String): Unit =
    println(s"\nResult: $result")
}
