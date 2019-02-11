package tv.teads.tour.basics

object Basics {

  /**
    * Expressions - 1
    */

  private val basic = "basic"
  private val string = "string"

  // Write an expresision which is the concatenation of "basic" and "string" using the
  // two variables above. Use the '+' operator to concatenate strings
  def basicString: String = ???

  /**
    * Expressions - 2
    */

  private val twelve = ???
  private val one = ???

  // Write an expression which is the sum of twelve and one
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

  // create a method that remove 2 to its input

  def remove2(input: Int): Int = ???

  // create a function that remove 2 to its input

  val remove2lambda: Int => Int = ???


  // Given :
  // - a hashing function that turns a String into an Int
  // - a function that takes a hashing function and adds a salt (hash + 2, for example)

  private val hashingFunction: String => Int = _.hashCode

  private def addSaltToHash(hashingFunction: String => Int)(input: String): Int = {
    hashingFunction(input) + 2
  }

  // Use the 2 functions above to create a function that applies the salted hash to its input

  val hashAndSalt: String => Int = ???

  // Use saltedHash to create a function that will always return 0 given any input String

  val uniformHashAndSalt: String => Int = ???

  /**
    * Classes
    */

  class Employee(name: String) {

    val lowerCaseName: String = name.toLowerCase()
  }

  val employee = new Employee("John")
  println(employee.lowerCaseName) // prints "john"

  val employee1 = new Employee("Toto")
  val employee2 = new Employee("Toto")

  assert(employee1 == employee2) // fails, like in Java

  /**
    * Case classes
    */

  case class Player(name: String)

  val john = Player("John") // No "new" needed

  val player1 = Player("Toto")
  val player2 = Player("Toto")

  assert(player1 == player2) // succeeds !
  player1.equals(player2) // fails

  // Bonus : the pattern matching
  john match {
    case Player("Toto") => println("I got Toto !!")
    case Player(name) => println(s"$name is not who I'm looking for, where is Toto ??")
  }
  // prints "John is not who I'm looking for, where is Toto ??"

  john match {
    case Player(name) if name.endsWith("o") => println("this player sounds Spanish")
    case _ =>
  }
  // prints nothing


  // Exercise

  // Given a player input and using a pattern match :
  // - return true if its name startsWith 'T'
  // - return false otherwise

  def startsWithT(player: Player): Boolean = ???

}
