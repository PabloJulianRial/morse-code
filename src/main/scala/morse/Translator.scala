package morse

import morse.MorseCode.morseToEnglish

object Translator{

  import morse.MorseCode.englishToMorse

  def translatorEtoM(str:String):String = {
    def translatorHelper(acc:String, strLength: Int):String ={
      if (strLength >= str.length) acc
      else translatorHelper(acc + englishToMorse(str.charAt(strLength))  + " ", strLength + 1 )
    }
    translatorHelper("", 0).trim
  }



  def translatorMtoE(str: String): String = {
    val splitStr = str.split(" ")
    def translatorHelper(acc: String, strLength: Int): String = {
      if (strLength >= splitStr.length) acc
      else translatorHelper(acc + morseToEnglish(splitStr(strLength)) , strLength + 1)
    }

    translatorHelper("", 0).trim
  }

}
