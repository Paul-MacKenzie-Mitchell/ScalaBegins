

//tail recursion - last last thing done in an expression is the recursion



object TailRecursion {
  def factorial(x: Int): Int = {
    if (x == 1)  1
    else x * factorial(x - 1)
  }

  def facTail(x: Int): Int = {
    def go(i: Int, a: Int): Int = {
      if (i == 1) a
      else go((i - 1),(a * i))
    }

    go(x, 1)
  }

  def fib(x: Int): Int = {
    if (x == 0) 0
    else if (x == 1) 1
    else fib(x - 1) + fib(x - 2)
  }

  def tailFib(x: Int): Int = {
    def go (n:Int, a: Int, b: Int): Int = {
      if (n == 1) b
      else if (n == 0) a
      else go((n - 1),(b),(a+b))
    }
    go (x, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(facTail(4))
    println(factorial(4))
    println(fib(13))
    println(tailFib(13))
  }
}
