object DivideAndConquer {
  def BinarySearch(xs: Array[Int], x: Int): Int = {
    def go(ns: Array[Int], n: Int, startIndex: Int, endIndex: Int): Int = {
      if (ns.length == 0) -1
      else if (n == ns((startIndex + endIndex) / 2 ))  ((startIndex + endIndex) / 2)
      else if (startIndex == endIndex) ns(startIndex)
      else if (n < ns((startIndex + endIndex) / 2 )) go(ns, n, startIndex, (((startIndex + endIndex) / 2 ) -1))
      else go(ns, n, (((startIndex + endIndex) / 2 ) + 1), endIndex)
    }
    go(xs, x, 0, (xs.length - 1))
  }

  def main(args: Array[String]): Unit = {
    val myArray3 = Array(1,2,3,4,5,6,7,8,9,10,11)
    println(BinarySearch(myArray3, 6))
  }
}
