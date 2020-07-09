package com.muthyatechnology.classes.privatemembers

object PrivatemembersApp extends App {
  val point1 = new Point
  point1.x=23// X is public variable
println(point1.x)
  point1.y_=(23)// Y is private variable
  point1.y=12
  println(point1.y)

}
