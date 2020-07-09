package com.muthyatechnology.classes.getterssetters

object GettersSettersApp extends App {
val point1 = new Point
point1.x_=(99)//1st way of setting
  point1.x=23 // 2nd way of setting
  //we will get the latest value as output
  println(point1.x)
  point1.y_=(24)//1st way of setting
point1.y = 101 // prints the warning// 2nd way of setting
  //we will get the latest value as output
  println(point1.y)
}
