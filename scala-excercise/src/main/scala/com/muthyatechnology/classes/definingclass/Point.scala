package com.muthyatechnology.classes.definingclass

class Point(var x: Int, var y: Int) {

    def move(dx: Int, dy: Int) = {
      x = x + dx
      y = y + dy
    }

    override def toString: String =
      s"($x, $y)"


}
