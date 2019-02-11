package tv.teads.tour.basics

import org.scalatest.{FlatSpec, Matchers}
import tv.teads.tour.basics.Basics.Player

class BasicsSpec extends FlatSpec with Matchers {

  "basicString" should "be the concatenation of basic and string" in {

    Basics.basicString should be("basicstring")
  }

  "thirteen" should "be the sum of twelve and one" in {

    Basics.thirteen should be(13)
  }

  "blocks" should "return the last expression" in {

    Basics.block should be(3)
  }

  "functions" should "return their input minus 2" in {

    Basics.remove2(12) should be(10)
    Basics.remove2lambda(12) should be(10)
  }

  "curried functions" should "hash and salt an input" in {

    Basics.hashAndSalt("toto") should be("toto".hashCode + 2)
    Basics.uniformHashAndSalt("blablabla") should be(0)
  }

  "startsWithT" should "return true for Toto" in {
    Basics.startsWithT(Player("Toto")) should be(true)
    Basics.startsWithT(Player("Bob")) should be(false)
  }

  "startsWithT" should "return false for Bob" in {
    Basics.startsWithT(Player("Bob")) should be(false)
  }

}
