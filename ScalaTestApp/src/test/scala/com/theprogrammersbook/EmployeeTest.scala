package com.theprogrammersbook

import org.scalatest.{BeforeAndAfter, FunSuite}

class EmployeeTest extends FunSuite with BeforeAndAfter{
     var employee : Employee = _
  before{
    employee  = new Employee
  }
  test("testing employee name .."){
      assert(employee.getName().equals("Employee1"))
  }
}
