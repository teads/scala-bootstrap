package tv.teads.step1

import org.scalatest.{ FlatSpec, Matchers }

class TraitsSpec extends FlatSpec with Matchers {

  "wilds" should "contain only wild animals" in {
    Traits.wilds should contain theSameElementsAs List(Traits.lion, Traits.bear)
  }

  "harry value" should "contain only the dog named harry" in {
    Traits.harry should be(Traits.dog)
  }

}
