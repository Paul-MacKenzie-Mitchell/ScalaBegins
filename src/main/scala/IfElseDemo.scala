object IfElseDemo {
  def main(args: Array[String]) {
    val x =20
    var response = ""
    if (x==20) {
      response = "x == 20"
    } else {
      response = " x != 20"
    }
    println(response)

    println (if (x == 20) "x == 20" else "x != 20")
  }
}
