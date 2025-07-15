package morse

import morse.MorseCode.morseToEnglish

object Translator extends App {

  import morse.MorseCode.englishToMorse

  val englishString:String = "HELLO HOW ARE YOU"
  val morseString:String = ".... . .-.. .-.. --- / .... --- .-- / .- .-. . / -.-- --- ..-"

  def translatorEtoM(str:String):String = {
    def translatorHelper(acc:String, strLength: Int):String ={
      if (strLength >= str.length) acc
      else translatorHelper(acc + englishToMorse(str.charAt(strLength))  + " ", strLength + 1 )
    }
    translatorHelper("", 0).trim
  }
  println(translatorEtoM(englishString))


  def translatorMtoE(str: String): String = {
    val splitStr = str.split(" ")
    def translatorHelper(acc: String, strLength: Int): String = {
      if (strLength >= splitStr.length) acc
      else translatorHelper(acc + morseToEnglish(splitStr(strLength)) , strLength + 1)
    }

    translatorHelper("", 0).trim
  }
  println(translatorMtoE(morseString))
}
