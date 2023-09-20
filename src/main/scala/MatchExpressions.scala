object MatchExpressions {
  def main(args: Array[String]): Unit = {
    val age = 18

    age match {
      case 20 => println(age)
      case 16 => println(age)
      case 12 => println(age)
      case _ => println("Default Case")
    }
    println()

    val result = age match {
      case 20 => age
      case 16 => age
      case 12 => age
      case _ => "Default Case"
    }
    println(result)
    println()

    val i = 7
    i match {
      case 1|3|5|7|9 => println("odd")
      case 2|4|6|8|10 => print("even")
    }
  }
}
