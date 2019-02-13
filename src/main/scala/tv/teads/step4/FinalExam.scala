package tv.teads.step4

object FinalExam {

  // Q1 : Given a minimum eligible price and a list of Bidders, compute the winner of the auction
  // If there are at least two equal maximum bidders, there is no winner

  /**
    * Tip 1 : List.sorted / List.sortBy(f: A => Sortable (ex: BigDecimal))
    * Tip 2 : List(1, 2).reverse = List(2, 1)
    */

  case class Bidder(name: String, bid: BigDecimal)

  def computeWinner(floorPrice: BigDecimal, bidders: List[Bidder]): Option[Bidder] = {
    ???
  }

  // Q2 : How to better handle the case where there are multiple maximum bidders ?
}
