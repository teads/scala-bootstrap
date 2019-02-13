package tv.teads.step3

import org.scalatest.{ FlatSpec, Matchers }

class ListsSpec extends FlatSpec with Matchers {

  "functionOnAList" should "compute well" in {

    Lists.functionOnAList(List(2, 3, 4)) should be(9)
  }

}
