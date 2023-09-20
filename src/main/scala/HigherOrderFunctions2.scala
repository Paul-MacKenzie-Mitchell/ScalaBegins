object HigherOrderFunctions2 {

  def sumInts(a: Int, b: Int): Int = {
    if (a > b) 0
    else a + sumInts(a + 1, b)
  }

  def cube(x: Int): Int = {
    x * x * x
  }

  def sumCubes(a: Int, b: Int): Int = {
    if (a > b) 0
    else cube(a) + sumCubes(a + 1, b)
  }

  def fact(a: Int): Int = {
    if (a == 0) 1
    else a * fact(a - 1)
  }

  def sumFactorials(a: Int, b: Int): Int = {
    if (a > b) 0
    else fact(a) + sumFactorials(a + 1, b)
  }

  // Higher Order Functions Below

  def id(x: Int): Int = x

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)
  }

  def sumIntsF(a: Int, b: Int): Int = {
    sum(id, a, b)
  }

  def sumCubesF(a: Int, b: Int): Int = {
    sum(cube, a, b)
  }

  def sumFactorialsF(a: Int, b: Int): Int = {
    sum(fact, a, b)
  }

  def sum2(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int =
      if (a > b) acc
      else loop(a + 1, acc + f(a))
    loop(a, 0)
  }

  def main(args: Array[String]): Unit = {
    println(fact(4))
  }
}
