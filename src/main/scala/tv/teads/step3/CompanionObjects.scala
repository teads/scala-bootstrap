package tv.teads.step3

object CompanionObjects {

  case class Employee(
    id: Int,
    name: Option[String],
    age: Option[Int] = None
  ) {

    // Q1: Return the name if present, else the id
    def naming: String = ???
  }

  object Employee {

    // Q2: Return an employee with id as the only available information
    def apply(id: Int): Employee = ???

    // Q3: We know the id of 'Francis' is 3, but we don't have any data about other names
    def apply(name: String): Option[Employee] = ???

  }

}
