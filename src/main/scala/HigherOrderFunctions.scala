object HigherOrderFunctions {

  def math(x: Double, y: Double, f: (Double, Double)=>Double): Double = f(x, y)

  def math2(x: Double, y: Double, z: Double, f: (Double, Double)=>Double): Double = f(f(x, y), z)

  def main(args: Array[String]): Unit = {
    val result = math(50, 20, (x, y) => x + y)
    val result2 = math(50, 20, (x, y) => x * y)
    val result3 = math(50, 20, (x, y) => x min y)
    val result4 = math(50, 20, (x, y) => x max y)
    println(result)
    println(result2)
    println(result3)
    println(result4)
    println()

    val threeValResult = math2(10,11,12, (x,y)=>x max y)
    println(threeValResult)

    //wild card

    val threeValResult2 = math2(10,11,12, _+_)
    println(threeValResult2)
    val threeResult3 = math2(15,200,39, _-_)
    println(threeResult3)
    val threeResult4 = math2(15,200,39, _ max _)
    println(threeResult4)
  }
}
