package tv.teads.step1

import org.scalatest.{ FlatSpec, Matchers }
import tv.teads.step1.Classes.Player

class ClassesSpec extends FlatSpec with Matchers {

  "startsWithT" should "return true for Toto" in {
    Classes.startsWithT(Player("Toto")) should be(true)
    Classes.startsWithT(Player("Bob")) should be(false)
  }

  "startsWithT" should "return false for Bob" in {
    Classes.startsWithT(Player("Bob")) should be(false)
  }

}
