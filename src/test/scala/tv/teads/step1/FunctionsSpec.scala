package tv.teads.step1

import org.scalatest.{ FlatSpec, Matchers }

class FunctionsSpec extends FlatSpec with Matchers {

  "blocks" should "return the last expression" in {

    Functions.block should be(3)
  }

  "functions" should "return their input minus 2" in {

    Functions.remove2(12) should be(10)
    Functions.remove2lambda(12) should be(10)
  }

  "curried functions" should "hash and salt an input" in {

    Functions.hashAndSalt("toto") should be("toto".hashCode + 2)
    Functions.uniformHashAndSalt("blablabla") should be(0)
  }

}
