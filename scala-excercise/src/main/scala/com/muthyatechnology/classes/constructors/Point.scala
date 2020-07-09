package com.muthyatechnology.classes.constructors
/*
Constructor - helps to create Objects ..
If needs ,we can pass values to it.
 */
class Point(var x: Int = 0, var y: Int = 0){
  override def toString: String =
    s"($x, $y)"
}
