package tv.teads.tour

import org.scalatest.{FlatSpec, Matchers}
import Step_1_Basics.Player

class BasicsSpec extends FlatSpec with Matchers {

  "basicString" should "be the concatenation of basic and string" in {

    Step_1_Basics.basicString should be("basicstring")
  }

  "thirteen" should "be the sum of twelve and one" in {

    Step_1_Basics.thirteen should be(13)
  }

  "blocks" should "return the last expression" in {

    Step_1_Basics.block should be(3)
  }

  "functions" should "return their input minus 2" in {

    Step_1_Basics.remove2(12) should be(10)
    Step_1_Basics.remove2lambda(12) should be(10)
  }

  "curried functions" should "hash and salt an input" in {

    Step_1_Basics.hashAndSalt("toto") should be("toto".hashCode + 2)
    Step_1_Basics.uniformHashAndSalt("blablabla") should be(0)
  }

  "startsWithT" should "return true for Toto" in {
    Step_1_Basics.startsWithT(Player("Toto")) should be(true)
    Step_1_Basics.startsWithT(Player("Bob")) should be(false)
  }

  "startsWithT" should "return false for Bob" in {
    Step_1_Basics.startsWithT(Player("Bob")) should be(false)
  }

}
