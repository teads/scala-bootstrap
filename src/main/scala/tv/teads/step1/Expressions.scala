package tv.teads.step1

object Expressions {

  /**
    * Expressions - 1
    */

  private val basic = "basic"
  private val string = "string"

  // Write an expression which is the concatenation of "basic" and "string" using the
  // two variables above. Use the '+' operator to concatenate strings
  def basicString: String = ???

  /**
    * Expressions - 2
    */

  private val twelve = ???
  private val one = ???

  // Q1 : Write an expression which is the sum of twelve and one
  def thirteen: Int = ???

  /**
    * Values / variables
    */

  private var titi = 1
  // this compiles
  titi += 2

  private val toto = 1
  // the following won't compile, try it yourself !
  // toto += 2

}
