package tv.teads.tour

object Step_2_Options {

  /**
    * Options
    */

  case class Player(name: String)

  private def createPlayer(playerName: String): Player = playerName match {
    case name if name.length < 8 => Player(name)
    case _ => null
  }

  private val nullPlayer = createPlayer("Rastapopoulos") // null

  // calling nullPlayer.name will throw a NullPointerException

  // Introducing Options

  private def createShortNamePlayer(playerName: String): Option[Player] = playerName match {
    case name if name.length < 8 => Some(Player(name))
    case _ => None
  }

  private val nonePlayer = createShortNamePlayer("Rastapopoulos")

  // nonePlayer.name doesn't compile because name is not a field of Option

  nonePlayer match {
    case Some(player) => println(s"Player is : ${player.name}")
    case None => println("There's no player")
  }
  // prints "There's no player"

  /**
    * Option.map
    */

  nonePlayer.map(player => player.name) // Option[String] = None

  private val somePlayer = createShortNamePlayer("Titi") // Some(Player("Titi"))

  somePlayer.map(player => player.name) // Option[String] = Some("Titi")

  /**
    * Option.foreach
    */

  nonePlayer.foreach(println) // None
  somePlayer.foreach(println) // Some(Player("Titi"))

  /**
    * Option.filter
    */

  nonePlayer.filter(_.name.startsWith("T")) // None

  somePlayer.filter(_.name.startsWith("O")) // None
  somePlayer.filter(_.name.startsWith("T")) // Some(Player("Titi"))

  /**
    * Option.getOrElse
    */

  nonePlayer.getOrElse(10) // 10
  somePlayer.getOrElse(10) // Some(Player("Titi"))


  // Q1 : Create a function :
  // - Given an option of an integer
  // - removing 8 from it
  // - return its value if it is positive
  // - return 0 otherwise

  def remove8AndReturnIfPositive(input: Option[Int]): Option[Int] = {
    ???
  }

}
