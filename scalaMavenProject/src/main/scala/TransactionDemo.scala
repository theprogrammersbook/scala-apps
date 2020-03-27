object TransactionDemo {
  def main(args: Array[String]): Unit = {
    println("TransactionDemo")
    transaction {
      implicit thisTransaction => val res = f1(args.length)
        println(if (thisTransaction.isAborted) "aborted" else s"result: $res")
    }

  }
  def transaction[T](op: Transaction => T) = {
    val trans: Transaction = new Transaction
    op(trans)
    trans.commit()
  }
  def f1(x: Int)(implicit thisTransaction: Transaction): Int = {
    thisTransaction.println(s"first step: $x")
    f2(x + 1)
  }
  def f2(x: Int)(implicit thisTransaction: Transaction): Int = {
    thisTransaction.println(s"second step: $x")
    f3(x * x)
  }
  def f3(x: Int)(implicit thisTransaction: Transaction): Int = {
    thisTransaction.println(s"third step: $x")
    if (x % 2 != 0) thisTransaction.abort()
    x
  }

}
