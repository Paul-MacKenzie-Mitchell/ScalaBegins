object Closures {
import java.util.Date

//A Closure is a function which uses one or more variables declared outside this function

  var number = 10
  val add = (x: Int) => x + number //number is a variable outside of the function

  val add2 = (x: Int) => {  //changes made inside a closure are passed back
    number = x + number
    number
  }

  //if the outside variable is declared as var it is an impure function (the variable can change)
  //if the outside variable is declared as a val it is a pure function (the variable is constant)


  def main(args: Array[String]): Unit = {
    number = 100 //the closure takes the most recent state of the variable
    println(add(20))
    println(add2(20))
    println(number)
  }
}
