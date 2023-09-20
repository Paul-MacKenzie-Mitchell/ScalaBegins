object Sets {

  // a set cannot have duplicate values (Hash Set)
  //can be mutable or immutable, by default all sets are immutable
  //values are unordered you cannot index sets

  val myList: List[Int] =List(1, 2, 3, 4, 5, 5)
  val mySet: Set[Int] = Set(1, 2, 3, 4, 5, 5, 6)
  val mySetSecond: Set[Int] = Set(6, 7,8,9,10)

  val mySet2 =scala.collection.mutable.Set("Max", "Tom", "John") //declaring a mutable set

  def main(args: Array[String]): Unit = {
    println(mySet)
    println(mySet + 10) //add a value to a set
    println(mySet) //immutable so unchanged
    println(mySet(4)) // checks if present not index
    println(mySet(100))
    println(mySet2)
    println(mySet.head)
    println(mySet.tail)
    println(mySet.isEmpty)
    println(mySet ++ mySetSecond) //concatenate sets

    println(mySet.&(mySetSecond)) // prints intersection of sets (shared values)
    println(mySet.intersect(mySetSecond))
    println(mySet.max)
    println(mySet.min)

    mySet.foreach(print) // no order
    println()

    for (name <- mySet2) {
      println(name)
    }


  }
}
