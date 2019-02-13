package tv.teads.step1

import org.scalatest.{ FlatSpec, Matchers }

class ExpressionsSpec extends FlatSpec with Matchers {

  "basicString" should "be the concatenation of basic and string" in {

    Expressions.basicString should be("basicstring")
  }

  "thirteen" should "be the sum of twelve and one" in {

    Expressions.thirteen should be(13)
  }

}
