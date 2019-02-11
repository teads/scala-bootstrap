package tv.teads.tour.basics

object FinalExam {

  // Given a minimum eligible price and a list of Bidders, compute the winner of the auction

  case class Bidder(name: String, bid: BigDecimal)

  def computeWinner(floorPrice: BigDecimal)(bidders: List[Bidder]): Option[Bidder] = {
    ???
  }

}
