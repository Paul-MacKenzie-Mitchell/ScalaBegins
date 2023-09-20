object String {

  val string1 : String = "Hello World" //same as Java String Class immutable
  val string2 : String = "Max"
  val num1 = 75
  val num2 = 100.25
  def main(args: Array[String]): Unit = {
    println(string1.length)
    println(string1.concat(" ").concat(string2))  //opt key click to see method documentation
    println(string1 + " " + string2)

    printf("(%d -- %f -- %s)", num1, num2, string1)
    println()
    println("(%d -- %f -- %s)".format(num1, num2, string1))
  }
}
