object PartiallyAppliedFunctions {
import java.util.Date

  def log(date: Date, message: String) = {
    println(date + " " + message)
  }

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c

    val f = sum(10, 20, _: Int) //third argument is a wildcard

    println(sum(10,20,30)) //fully applied function

    println(f(30)) //partially applied function

    val date = new Date
    val newLog = log(date, _: String)
    newLog("The message 1")
    newLog("The message 2")
    newLog("The message 3")
    newLog("The message 4")
  }
}
