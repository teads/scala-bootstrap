package tv.teads.step2

import org.scalatest.{ FlatSpec, Matchers }

class TuplesSpec extends FlatSpec with Matchers {

  "planetNames" should "contain all planet names" in {
    Tuples.planetNames should contain theSameElementsAs
      List("Mercury", "Venus", "Earth", "Mars", "Jupiter")
  }

  "planetNearSun" should "contain the planet with the lowest distance from the sun" in {
    Tuples.planetNearSun should be(("Mercury", 57.9))
  }

  "earthDistance" should "contain the distance between the earth and the sun" in {
    Tuples.earthDistance should be(149.6)
  }

}
