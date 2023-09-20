import Lists._

//arrays are mutable, lists are immutable
//lists represent linked lists

object Lists {

  val myList: List[Int] = List(1,2,3,4,5,6)
  val myList2: List[String] = List("Paul", "Amanda", "Axel")


  def main(args: Array[String]): Unit = {
    println(myList)
    println(myList2)
    println(0 :: myList) //prepends 0
    println(myList) //the list is not altered
    println(Nil) //creates an empty list
    println(1 :: 5 :: 9 :: Nil) //creates a list with these values

    println(myList.head)
    println(myList.tail) //tail is everything but the head
    println(myList.isEmpty)
    println(myList.reverse)
    println(List.fill(5)(2)) // 5 2's

    var sum: Int = 0
    myList.foreach(sum += _)
    println(sum)

    for (x <- myList) {
      print(x + 5 + " ")
    }
    println()

    println(myList2(0))
  }
}
