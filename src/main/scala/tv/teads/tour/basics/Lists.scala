package tv.teads.tour.basics

object Lists {

  val oneTwoThree = List(1, 2, 3)

  /**
    * List.map(Int => A)
    */

  oneTwoThree.map(elem => -elem) // List(-1, -2, -3)

  /**
    * List.filter(Int => Boolean)
    */

  oneTwoThree.filter(_ % 2 == 0) // List(2)

  /**
    * List.flatten transforms a list of list into a list
    */

  List(List(1, 2), List(4, 3)).flatten // List(1, 2, 4, 3)

  /**
    * List.flatMap(Int => List(Int)) maps a list and then flattens it
    */

  oneTwoThree.flatMap(elem => List(0, elem))
  // intermediate view : List(0, 1), List(0, 2), List(0, 3)
  // result : List(0, 1, 0, 2, 0, 3)

  /**
    * List.foldLeft(accumulator)(aggregateFunction) accumulates all elements using an initial value and an aggregate function
    */

  oneTwoThree.foldLeft(2)((acc, elem) => acc * elem)
  // intermediate view : (((2 * 1) * 2) * 3)
  // result : 12



  // Exercise :
  // Create a function that given an input list :
  // - Keeps odd values
  // - Multiply them by 3
  // - Computes the quadratic sum of each element of this list

  def functionOnAList(input: List[Int]): Int = {
    ???
  }

}
