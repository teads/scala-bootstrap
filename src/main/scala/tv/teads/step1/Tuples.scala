package tv.teads.step1

object Tuples {

  val planetsWithSunDistance =
    List(("Venus", 108.2), ("Earth", 149.6), ("Mercury", 57.9),
      ("Mars", 227.9), ("Jupiter", 778.3))

  // Q1: List all planet names

  val planetNames: Seq[String] = ???

  // Q2: Find the planet with lowest distance from the stun

  val planetNearSun: (String, Double) = ???

  // Q3: Find the distance of the Earth from the sun

  val earthDistance: Double = ???

}
