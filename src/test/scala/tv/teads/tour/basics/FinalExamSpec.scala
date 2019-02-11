package tv.teads.tour.basics

import org.scalatest.{FlatSpec, Matchers}
import tv.teads.tour.basics.FinalExam.Bidder

class FinalExamSpec extends FlatSpec with Matchers {

  "computeWinner" should "compute the best bidder" in {

    FinalExam.computeWinner(1)(List(Bidder("a", 3), Bidder("b", 2))) should
      be(Some(Bidder("a", 3)))
  }

  "computeWinner" should "return None when the list is empty" in {

    FinalExam.computeWinner(1)(List.empty) should be(None)
  }

  "computeWinner" should "return None when the bidders' bid are below the floor price" in {

    FinalExam.computeWinner(4)(List(Bidder("a", 3), Bidder("b", 2))) should be(None)
  }

}
