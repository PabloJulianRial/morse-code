package morse

object Translator extends App {

  import morse.MorseCode.englishToMorse

  val englishWord:String = "HELLO"

  def translatorEtoM(str:String):String = {
    def translatorHelper(acc:String, strLength: Int):String ={
      if (strLength >= str.length) acc
      else translatorHelper(acc + englishToMorse.get(str.charAt(strLength)) , strLength + 1 )
    }
    translatorHelper("", 0)
  }
  println(translatorEtoM(englishWord))


}
