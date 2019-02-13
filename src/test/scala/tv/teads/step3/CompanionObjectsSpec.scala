package tv.teads.step3

import org.scalatest.{ FlatSpec, Matchers }

class CompanionObjectsSpec extends FlatSpec with Matchers {

  "Employee.naming" should "either return the name of the employee or the id" +
    " if name not present" in {

    val employeeWithName = CompanionObjects.Employee(1, Some("Henry"))
    assert(employeeWithName.naming == "Henry")

    val employeeWithoutName = CompanionObjects.Employee(2, None)
    assert(employeeWithoutName.naming == "2")
  }

  "Employee.apply(id)" should "return an employee with only an id when only this" +
    " info is provided" in {

    val employeeWithoutName = CompanionObjects.Employee(4)
    assert(employeeWithoutName.id == 4 && employeeWithoutName.name.isEmpty)
  }

  "Employee.apply(name)" should "return the employee 'Francis' with his proper id" +
    " if his name is provided, else nothing" in {

    val francis = CompanionObjects.Employee("Francis")
    assert(francis.map(_.id).contains(3))

    val random = CompanionObjects.Employee("Bob")
    assert(random.isEmpty)
  }

}
