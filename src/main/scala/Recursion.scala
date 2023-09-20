import Recursion.reverseString

object Recursion {

  //What is the base case?
  //What is the smallest amount of work I can do in each iteration

  def reverseString(str: String): String = {
    if (str.tail.isEmpty) str
    else reverseString(str.tail) + str.head
  }

  def palindrome(str: String): Boolean = {
    if (str.length == 0 || str.length == 1) true
    else if (str.head.equals(str(str.length - 1))) palindrome(str.drop(1).dropRight(1))
    else false
  }

  def decimalToBinary(n: Int): String = {
    def go(x: Int, str: String): String = {
      if (x == 0) str
      else go((x / 2), (x % 2).toString + str)
    }
    if (n == 0) "0"
    go(n,"")
  }

  def sumOfNaturalNumbers(n: Int): Int = {
    def go(x: Int, a: Int): Int = {
      if (x == 0) a
      else go((x - 1), (a + x))
    }
    go(n, 0)
  }

  def main(args: Array[String]): Unit = {
    println(reverseString("What ???"))
    println(palindrome("racecar"))
    println(decimalToBinary(233))
    println(sumOfNaturalNumbers(1))
  }
}
