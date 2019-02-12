package tv.teads.step1

object Traits {

  trait Animal

  trait Wild extends Animal {
    val habitat: String
  }

  trait Pet extends Animal {
    val name: String
  }

  case class Cat(name: String) extends Pet
  case class Dog(name: String) extends Pet
  case class Lion(habitat: String) extends Wild
  case class Bear(habitat: String) extends Wild

  val dog = Dog("Harry")
  val cat = Cat("Sally")
  val lion = Lion("Savannah")
  val bear = Bear("Mountain")

  val animals: List[Animal] = List(dog, cat, lion, bear)

  // Q1: Filter animals from the list which are wild animals
  val wilds: List[Wild] = ???

  // Q2: Find inside the list the animal with the name 'harry'
  val harry: Animal = ???

}
