package com.muthyatechnology.classes.privatemembers

class Point {
   var x = 0
  private var _y = 0
  private val bound = 100


 def y=_y
  def y_=(newValue:Int):Unit = {if(newValue < bound)_y=newValue else getWarning}

  private def getWarning = print("WARNING out of bounds")
}