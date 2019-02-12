package tv.teads.step4

import org.scalatest.{ FlatSpec, Matchers }
import tv.teads.step4.FinalExam.Bidder

class FinalExamSpec extends FlatSpec with Matchers {

  "computeWinner" should "compute the best bidder" in {

    FinalExam.computeWinner(
      1,
      List(Bidder("a", 3), Bidder("b", 2))
    ) should be(Some(Bidder("a", 3)))
  }

  "computeWinner" should "return None when there are 2 equal max bidders" in {

    FinalExam.computeWinner(
      1,
      List(Bidder("a", 3), Bidder("b", 3), Bidder("c", 2))
    ) should be(None)
  }

  "computeWinner" should "return None when there are 3 equal max bidders" in {

    FinalExam.computeWinner(
      1,
      List(Bidder("a", 3), Bidder("b", 3), Bidder("a", 3), Bidder("c", 2))
    ) should be(None)
  }

  "computeWinner" should "return None when the list is empty" in {

    FinalExam.computeWinner(1, List.empty) should be(None)
  }

  "computeWinner" should "return None when the bidders' bids are below the floor price" in {

    FinalExam.computeWinner(4, List(Bidder("a", 3), Bidder("b", 2))) should be(None)
  }
}
