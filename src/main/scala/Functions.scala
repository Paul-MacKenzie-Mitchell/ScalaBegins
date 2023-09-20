object Functions {

  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y
    }
    def square(x: Int): Int = x * x
  }

  //ways to declare a function
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  def subtract(x: Int, y: Int): Int = {
    x - y
  }

  def multiply(x: Int, y: Int): Int = x * y

  def divide(x: Int, y: Int): Int =
    x / y

  def add2(x: Int = 5, y: Int = 15): Int = x + y

  //function with no return

  def makeWord(x: String, y: String): Unit = println(x + y)

  //you can define a function name as an operator such as + ** +++ etc.

  def main(args: Array[String]): Unit = {
    println(add(3, 2))
    println(subtract(3, 2))
    println(multiply(3, 2))
    println(divide(3, 2))
    println(Math.add(5,5))
    println(Math.square(3))
    println(Math square 5)  //single argument function
    println(add2())
    println(add2(100))
    println(add2(15,15))
    makeWord("Hell","o")
  }
}
