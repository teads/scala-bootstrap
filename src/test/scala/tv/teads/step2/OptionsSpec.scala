package tv.teads.step2

import org.scalatest.{ FlatSpec, Matchers }

class OptionsSpec extends FlatSpec with Matchers {

  "remove8AndReturnIfPositive" should "return input minus 8 when positive" in {

    Options.remove8AndReturnIfPositive(Some(9)) should be(Some(1))
  }

  "remove8AndReturnIfPositive" should "return None when input minus 8 is not positive" in {

    Options.remove8AndReturnIfPositive(Some(7)) should be(None)
  }

}
