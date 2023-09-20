object HelloWorld {
  def main(args: Array[String]) {
    val name = "mark"
    val age = 18
    println(name + " is " + age + " years old")
    println(s"$name is $age years old") // S string interpolations (not type safe)
    println(f"$name%s is $age%d years old")  // F string interpolation (Type Safe)
    println("Hello \nWorld")
    println(raw"Hello \nWorld")
    println("Hello World")
  }
}
