package tv.teads.step3

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
    * List.foldLeft(accumulator)(aggregateFunction: (accumulator, element) => new accumulator)
    * accumulates all elements using an initial value and an aggregate function
    */

  oneTwoThree.foldLeft(2)((acc, elem) => acc * elem)
  oneTwoThree.foldLeft(2) {
    case (acc, elem) if acc > 10 => 0
    case (10, elem) => 10
    case (acc, elem) => acc * elem
  }
  // intermediate view : (((2 * 1) * 2) * 3)
  // result : 12

  /**
    * Pattern matching a list :
    */

  oneTwoThree match {
    case 1 :: 2 :: 3 :: Nil =>
    // Deconstructs a List in the form el1 :: (el2 :: (el3 :: EmptyList)))
    // This can only match List(1, 2, 3) which is equivalent to 1 :: 2 :: 3 :: Nil
    case 1 :: 2 :: 3 :: t =>
    // Deconstructs a List in the form el1,el2,el3,List(empty or not)
    // This can match List(1, 2, 3), but also List(1, 2, 3, "blabla", 12)
    // in which case t will equal List("blabla", 12)
    case 1 :: t => // Deconstructs a List in the form el1 :: List
    // Deconstructs List(1, 2, 3) in the form 1 :: t with t = List(2, 3)
    case h :: t =>
    // Deconstructs any list with at least one element (head, tail which can be empty or not)
    case l =>
    // fallback case : deconstructs any list, empty or not
  }


  // Q1 : Create a function that given an input list :
  // - Keeps odd values
  // - Multiply them by 3
  // - Computes the quadratic sum of each element of this list

  def functionOnAList(input: List[Int]): Int = {
    ???
  }

}
