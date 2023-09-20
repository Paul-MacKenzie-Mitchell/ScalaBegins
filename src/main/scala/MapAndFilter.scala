object MapAndFilter {

  val first = List(1, 2, 4, 5, 7, 10, 13)
  val list2 = List((1, 2, 3, 4), (5, 6, 7, 8))
  val myMap = Map(1 -> "Tom", 2 -> "Jerry", 3 -> "John")

  def main(args: Array[String]): Unit = {
    println(first.map(_ * 2))
    println(first.map(x => x * x))
    println(first.map(x => "hi " + x))
    println(first.map(x => "hi" * x))

    println(myMap.map(x => "hi" + x))  //prints as a Tuple
//    println(myMap.mapValues(x => "hi" + x)) //deprecated
    println("hello".map(_.toUpper))
    println(first.flatMap(x => List(x, x+1)))
    println(first.filter(x => x%2 == 0))  //uses a predicate or a function that returns a boolean value
  }
}
