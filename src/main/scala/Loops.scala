object Loops {
  def main(args: Array[String]): Unit = {
    var x = 0

    while (x < 5) {
      x += 1
      println("x = " + x)
    }
    println()

    do {
      x += 2
      println(x)
    } while ( x < 20)
    //  for (var a <- Range) {}
    println()

    for (i <- 1 to 5) {
      println("=> " + i)
    }
    println()
    for (i <- 1.until(6)) {
      println("!!!" + i)
    }
    println()
    for (i <- 0 until 10) {
      println("using until" + i)
    }
    println()
    for (i <- 1 to 5; j <- 5 to 8) {
      println("=> " + i + " " + j)
    }
    println()

    val lst = List('A', 'B', 'C', 'D')

    for (i <- lst) {
      println(i)
    }
    println()

    for (i <- lst; if i != 'A') {
      println(i)
    }
    println()

    val result = for {i <- lst; if i != 'A'} yield {
      i.toLower
    }
    println(result)
    println()
  }
}
