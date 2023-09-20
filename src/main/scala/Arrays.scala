import Array._

object Arrays {


  val myArray: Array[Int] = new Array[Int](4) //declare new array
  val myArray2 = new Array[Int](5)  //declare array 2
  val myArray3 = Array(1,2,3,4,5,6,7,8,9,10)  //define array

  def main(args: Array[String]): Unit = {
    myArray(0) = 0
    myArray(1) = 1
    myArray(2) = 2
    myArray(3) = 3

    val result = concat(myArray,myArray3)

    for (x <- myArray) {
      println(x)
    }

    for (i <- 0 to (myArray.length - 1)) {
      print(i)
    }
    for (x <- myArray2) {  // prints default value of that data type if no values in array
      println(x)
    }
    for (x <- myArray3) {
      print(x)
    }
    println()
    for (x <- result) {
      print(x)
    }
  }
}
