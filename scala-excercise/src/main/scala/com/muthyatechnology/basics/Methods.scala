package com.muthyatechnology.basics

object Methods extends  App {
/*
Methods
Methods look and behave very similar to functions, but there are a few key differences between them.

Methods are defined with the def keyword. def is followed by a name, parameter lists, a return type, and a body.
 */
  /*//Basic Implementation.
  def add(x: Int, y: Int): Int = x + y
  println(add(1, 2)) // 3*/


/*  def addThenMultiply(x: Int, y: Int)(z: Int): Int = (x + y) * z
  println(addThenMultiply(1, 2)(3)) // 9*/

  /*
  Start
   */
 // no parameter lists at all.
/* def name: String = System.getProperty("user.name")
  println("Hello, " + name + "!")*/

  /*def name: String = "Good"
  println("Hello, " + name + "!")*/

  /*def name: String =  "Good"
  println("Hello, " + name + "!")*/
  /*
    End
   */
  /*
  Start :: Methods can have multi-line expressions as well.
   */
/*  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }

  //Min 1.7976931348623157e+308
  //Max 1.7976931348623157e+308

  print(getSquareString(343666669.7677))*/

 /* def getSquareString(input: Float): String = {
    val square = input * input
    square.toString
  }

  //Min  3.4028235e+38f
  //Max 3.4028235e+38f
  print(getSquareString(3.4028235e+38f))*/

/*  def getSquareString(input: Int): String = {
    val square = input * input
    square.toString
  }

  //Min  3.4028235e+38f
  //Max 3.4028235e+38f
  print(getSquareString(3))*/

  def getSquareString(input: Int): String = {
    val square = input * input
    square.toString
  }
  print(getSquareString(3))
  /*
   End :: Methods can have multi-line expressions as well.
    */


}
