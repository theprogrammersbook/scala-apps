package com.theprogrammersbook.scala

object EnumsCheck extends Enumeration {
  println("Step 1: How to create an enumeration")
    type EnumsCheck = Value
    val Glazed      = Value(0,"Glazed")
    val Strawberry  = Value(1,"Strawberry")
    val Plain       = Value(-1,"Plain")
    val Vanilla     = Value(2,"Vanilla")


  def main(args: Array[String]): Unit = {

    println("\nStep 2: How to print the String value of the enumeration")
    println(s"Vanilla EnumsCheck string value = ${EnumsCheck.Vanilla}")

    println("\nStep 3: How to print the id of the enumeration")
    println(s"Vanilla EnumsCheck's id = ${EnumsCheck.Vanilla.id}")


    println("\nStep 4: How to print all the values listed in Enumeration")
    println(s"EnumsCheck types = ${EnumsCheck.values}")

    println("\nStep 5: How to pattern match on enumeration values")
    EnumsCheck.values.foreach {
      case d if (d == EnumsCheck.Strawberry || d == EnumsCheck.Glazed) => println(s"Found favourite EnumsCheck = $d")
      case _ => None
    }
    

  }
}
