object Tuples {
  //can contain elements of different data types (heterogeneous)

  val myTuple = (1, 2, "Bob", true, 2.0) // tuple declaration (can even contain objects)
  //tuples are immutable

  val myTuple2 = new Tuple3(1, 1.0, (1,1)) //the number at the end of the tuple is the number of elements contained

  //allowed up to 22 elements

  def main(args: Array[String]): Unit = {
    println(myTuple)
    println(myTuple._1) //retrieve by  number (1 is first not 0)
    println()
    println(myTuple2._3)
    println(myTuple2._3._1) //accesses the tuple in the tuple by element
    println()

    myTuple.productIterator.foreach{
      i => print(i + " ")
    }
    println()

    println(1 -> "Tom") //creates a tuple (Only valid for two elements)
    println(1 -> "Tom" -> true) //creates a tuple of a tuple and the next value
  }
}
