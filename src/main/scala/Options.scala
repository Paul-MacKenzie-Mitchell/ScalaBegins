object Options {
  //can give you  (Some or None)

  val first = List(1, 2, 3, 4, 5)
  val map = Map(1 -> "Tom", 2 -> "Jerry", 3 -> "Tweety")

  val opt : Option[Int] = Some(5)
  val opt2 : Option[Int] = None

  def main(args: Array[String]): Unit = {
    println(first.find(_ > 6))  //no value satisfies
    println(first.find(_ <3))  // returns some and a value
    println(map.get(1))  //returns the value associated with key
    println(map.get(10))
    println(first.find(_ > 2).get)
    println(map.get(1).get)  //throws a no such element exception if it doesnt exist
    println(map.get(7).getOrElse("Not Found"))  //to prevent above error
    println(first.find(_ > 10).getOrElse("No Such Number"))

    println(opt.isEmpty)
    println(opt2.isEmpty)

    println(opt.get)
  }
}
