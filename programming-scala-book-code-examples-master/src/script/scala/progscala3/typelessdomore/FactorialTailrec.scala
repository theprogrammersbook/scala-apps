// src/script/scala/progscala3/typelessdomore/FactorialTailrec.scala
import scala.annotation.tailrec

def factorial(i: Int): Long =
  @tailrec
  def fact(i: Int, accumulator: Long): Long =
    if i <= 1 then accumulator
    else fact(i - 1, i * accumulator)

  fact(i, 1)

(0 to 5).foreach(i => println(s"$i: ${factorial(i)}"))
