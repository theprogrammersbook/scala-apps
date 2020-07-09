package com.muthyatechnology.basics

object Functions extends  App {
  /*val addOne = (x: Int) => x + 1
  println(addOne(1)) // 2*/

  /*val checkAdd = (x: Int) => x + 1
  println(checkAdd(1)) // 2*/

  /*val checkAdd = (hai: Int) => hai + 1
  println(checkAdd(1)) // 2*/

  /*  val checkAdd = (hai: Double) => hai + 1
    println(checkAdd(1)) // 2*/

  /* val checkAdd = (hai: Float) => hai + 1
   println(checkAdd(1)) // 2*/

  /*val checkAdd = (hai: Short) => hai + 1
  println(checkAdd(1)) // 2*/

  /*val checkAdd = (hai: Short) => hai + 1
  println(checkAdd(156757575)) // Type mismatch, expected Short, actual Int*/

  /* val checkAdd = (hai: Int) {  hai }
   println(checkAdd(1)) // Cannot resolve the symbol hai , because we have not added =>*/

  /*  val checkAdd = (x: Int) {  x }
    println(checkAdd(1)) // Cannot resolve the symbol x , because we have not added =>*/

  /* val checkAdd = (x: Int) => x, var y=x+2
   println(checkAdd(1)) // we have added , after x so
  // that is not able to identity x in the expression var y=x+2.*/
  val checkAdd = (x: Int)=> x
  println(checkAdd(1))

  //Start --- Functions may take multiple parameters.

  /*val add = (x: Int, y: Int) => x + y
  println(add(1, 2)) // 3*/

  /* // Arguments inter changed
   val add = (y: Int,x: Int) => x + y
   println(add(1, 2)) // 3*/
  /* // Expression Interchanged
   val add = (y: Int,x: Int) =>  y+x
   println(add(1, 2)) // 3*/

  // Values Interchanged
  val add = (y: Int,x: Int) =>  y+x
  println(add(2,1)) // 3
  //End --- Functions may take multiple parameters.


  //Start --- it can take no parameters.
  val getTheAnswer = () => 42
  println(getTheAnswer()) // 42

  //End ---it can take no parameters.
}
