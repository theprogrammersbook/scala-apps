package com.muthyatechnology.basics

object Expressions extends App{
  println(1) // 1
  println(1 + 1) // 2
  println("Hello!") // Hello!
  println("Hello," + " world!") // Hello, world!
  println("Hello," + 23) // Hello, 23

  //val x = 1 + 1

  //x = 3 // This does not compile.
 /* val x: Int = 1 + 1
  println(x) // 2*/
  var x = 1 + 1;
  x = 3 // This compiles because "x" is declared with the "var" keyword.
  println(x * x) // 9
}
