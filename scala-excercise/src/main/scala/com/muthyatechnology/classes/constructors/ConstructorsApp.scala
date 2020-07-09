package com.muthyatechnology.classes.constructors

object ConstructorsApp extends App {
  val origin = new Point  // x and y are both set to 0
  println(origin)
  // we are setting some value to Point Constructor , Here the Constructor is with 2 parameters
  // But here we have given 1 values .. So that scala compiler takes the given value to the first parameter of the Constructor

  val point1 = new Point(1)
  println(point1.x)  // prints 1
// Here we are giving the name of the parameter to which this values has to set.
  val point2 = new Point(y=2)
  println(point2.y)  // prints 2

 /* val point3 = new Point(y=2,2)
  println(point3.y) // Compilation error comes as positional parameter after named parameter.
*/
 val point4 = new Point(3,y=2)
  println(point4.x) // prints 3

}
