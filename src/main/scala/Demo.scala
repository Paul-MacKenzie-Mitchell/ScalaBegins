
class User(private var name : String, var age : Int) {
  def this() = {
    this("Axel", 7)
  }
  def this(name : String) {
    this(name, 7)
  }
  def printName{ println(name)}
  def setName(name: String) { this.name = name }
} // if you use val you cannot reassig.  You can mix and match



object Demo {
  def main(args: Array[String]): Unit = {

    var user1 = new User()
    var user2 = new User("Glop")
    var user3 = new User("Blop", 100)



    var user = new User("Max", 28)
    user.printName  //uses getter
    println(user.age)
    user.setName("Tom")  //uses setter
    user.age = 22
    user.printName //uses getter
    println(user.age)
  }
}
