package tv.teads.tour

import org.scalatest.{FlatSpec, Matchers}
import Step_4_FinalExam.Bidder

class FinalExamSpec extends FlatSpec with Matchers {

  "computeWinner" should "compute the best bidder" in {

    Step_4_FinalExam.computeWinner(
      1,
      List(Bidder("a", 3), Bidder("b", 2))
    ) should be(Some(Bidder("a", 3)))
  }

  "computeWinner" should "return None when there are 2 equal max bidders" in {

    Step_4_FinalExam.computeWinner(
      1,
      List(Bidder("a", 3), Bidder("b", 3), Bidder("c", 2))
    ) should be(None)
  }

  "computeWinner" should "return None when there are 3 equal max bidders" in {

    Step_4_FinalExam.computeWinner(
      1,
      List(Bidder("a", 3), Bidder("b", 3), Bidder("a", 3), Bidder("c", 2))
    ) should be(None)
  }

  "computeWinner" should "return None when the list is empty" in {

    Step_4_FinalExam.computeWinner(1, List.empty) should be(None)
  }

  "computeWinner" should "return None when the bidders' bid are below the floor price" in {

    Step_4_FinalExam.computeWinner(4, List(Bidder("a", 3), Bidder("b", 2))) should be(None)
  }
}
