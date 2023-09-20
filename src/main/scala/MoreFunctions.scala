object MoreFunctions {

  def greeting(n: String, a: Int):String = {
    "Hi, my name is " + n + " and I am " + a + " years old."
  }
  def factorial(n: Int): BigInt = {
    def go(x: Int, acc: BigInt): BigInt = {
      if (x <= 1) acc
      else go((x - 1), x * acc)
    }
    go(n,1)
  }


  def prime(x: Int): Boolean = {
    def go(x: Int, div: Int): Boolean ={
      if (div <= 1) true
      else if (x % div != 0) go(x, (div - 1))
      else false
    }
    go(x,x - 1)
  }

  def concatenate(s: String, n: Int): String = {
    def go(s: String, n: Int, acc: String): String = {
      if (n < 1) acc
      else go(s, (n - 1), (acc + s))
    }
    go(s, n, "")
  }

  def fibonacci(x: Int): Int = {
    if (x <= 0) 0
    else if (x == 1) 1
    else fibonacci(x - 1) + fibonacci(x - 2)
  }

  def fibTailRecursive(x: Int): Int = {
    def go(x: Int, nextToLast: Int, last: Int): Int = {
      if (x <= 0) 0
      else if (x == 1) last
      else go((x - 1), last, (nextToLast + last))
    }
    go(x ,0 , 1)
  }

  def main(args: Array[String]): Unit = {
    println(greeting("Paul", 41))
    println(factorial(5))
    println(fibonacci(5))
    println(fibTailRecursive(5))
    println(prime(2003))
    println(prime(2006))
    println(concatenate("Hi", 5))
  }
}
