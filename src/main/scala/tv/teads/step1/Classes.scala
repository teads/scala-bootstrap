package tv.teads.step1

object Classes {

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


  // Q6 : Given a player input and using a pattern match :
  // - return true if its name startsWith 'T'
  // - return false otherwise

  def startsWithT(player: Player): Boolean = ???

}
