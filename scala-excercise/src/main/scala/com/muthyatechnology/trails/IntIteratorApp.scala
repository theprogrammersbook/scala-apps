package com.muthyatechnology.trails

object IntIteratorApp extends App{
  val iterator = new IntIterator(10)
  println(iterator.next())  // returns 0
  println(iterator.next()) // returns 1
}
