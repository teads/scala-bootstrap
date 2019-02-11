package tv.teads.tour.basics

import org.scalatest.{FlatSpec, Matchers}

class OptionsSpec extends FlatSpec with Matchers {

  "remove8AndReturnIfPositive" should "return input - 8 when positive" in {

    Options.remove8AndReturnIfPositive(Some(9)) should be(Some(1))
  }

  "remove8AndReturnIfPositive" should "return None when input - 8 is not positive" in {

    Options.remove8AndReturnIfPositive(Some(7)) should be(None)
  }

}
