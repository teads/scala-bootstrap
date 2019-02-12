package tv.teads.tour

import org.scalatest.{FlatSpec, Matchers}

class ListsSpec extends FlatSpec with Matchers {

  "functionOnAList" should "compute well" in {

    Step_3_List.functionOnAList(List(2, 3, 4)) should be(9)
  }

}
