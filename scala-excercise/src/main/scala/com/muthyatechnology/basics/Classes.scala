package com.muthyatechnology.basics

object Classes extends App{
  class Greeter(suffix: String,prefix: String) {
    def greet(name: String): Unit =
      println(prefix + name + suffix)
  }

  class GreeterTwo {
    def greet(name: String): Unit =
      println(name)
  }

  class GreeterThree {
    var name :String = "Nagaraju"
    def greet(name: String): Unit =
      println(name)
  }

  val greeter = new Greeter("Hello, ", "!")
  greeter.greet("Scala developer") // Hello, Scala developer!

  var greeterTwo  = new GreeterTwo
  greeterTwo.greet("Good")

  var greeterThree = new GreeterThree
  print(greeterThree.name)
}
