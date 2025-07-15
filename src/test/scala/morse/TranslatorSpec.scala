package morse

import org.scalatest.funsuite.AnyFunSuite

class TranslatorSpec extends AnyFunSuite {

  test("translatorEtoM should turn HELLO into the correct Morse code") {
    val input  = "HELLO HOW ARE YOU"
    val expect = ".... . .-.. .-.. --- / .... --- .-- / .- .-. . / -.-- --- ..-"
    assert(Translator.translatorEtoM(input) == expect)
  }

  test("translatorEtoM on empty string returns empty") {
    assert(Translator.translatorEtoM("") == "")
  }


}
