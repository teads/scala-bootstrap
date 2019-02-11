package tv.teads.tour.basics

import org.scalatest.{FlatSpec, Matchers}

class ListsSpec extends FlatSpec with Matchers {

  "functionOnAList" should "compute well" in {

    Lists.functionOnAList(List(2, 3, 4)) should be(9)
  }

  "remove8AndReturnIfPositive" should "return None when input - 8 is not positive" in {

    Options.remove8AndReturnIfPositive(Some(7)) should be(None)
  }

}
