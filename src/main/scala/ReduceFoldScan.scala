object ReduceFoldScan {
  val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val lst2 = List("A", "B", "C")

  def main(args: Array[String]): Unit = {
    println(lst2.reduceLeft(_ + _))
    println(lst.reduceLeft(_ + _))
    println(lst.reduceLeft((x,y)=> {println(x + " " + y); x + y}))
    println(lst.reduceRight(_ - _))
    println(lst.reduceRight((x,y)=> {println(x + " " + y); x - y}))

    println(lst.foldLeft(10)(_ + _)) //the 10 is the beginning value

    println(lst.scanLeft(0)(_ + _))
  }
}
