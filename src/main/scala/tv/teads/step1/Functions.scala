package tv.teads.step1

object Functions {

  /**
    * Blocks
    */

  // make this block return 3 using an expression involving x
  val block: Int = {
    val x = 1 + 1
    x
  }

  /**
    * Methods, functions
    */

  // Q2 : create a method that remove 2 to its input

  def remove2(input: Int): Int = ???

  // Q3 : create a function that remove 2 to its input

  val remove2lambda: Int => Int = ???


  // Given :
  // - a hashing function that turns a String into an Int
  // - a function that takes a hashing function and adds a salt (hash + 2, for example)

  private val hashingFunction: String => Int = _.hashCode

  private def addSaltToHash(hashingFunction: String => Int)(input: String): Int = {
    hashingFunction(input) + 2
  }

  // Q4 : Use the 2 functions above to create a function that applies the salted hash to its input

  val hashAndSalt: String => Int = ???

  // Q5 : Use saltedHash to create a function that will always return 0 given any input String

  val uniformHashAndSalt: String => Int = ???

}
