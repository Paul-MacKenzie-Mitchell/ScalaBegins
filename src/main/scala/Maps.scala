object Maps {

  //a collection of key value pairs.  Keys are unique

  //maps are by default immutable but van be mutable

  //duplication of keys is not possible.  It excludes any duplicates

  //first datatype is key 2nd value
  val myMap : Map[Int, String] = Map(801 -> "max", 802 -> "Tom", 804 -> "July")
  val myMap2 : Map[Int, String] = Map(805 -> "Wayne")
  def main(args: Array[String]): Unit = {
    println(myMap)
    println(myMap(802))  //find by key
//    println(myMap(803))  //if key absent throws exception
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)

    myMap.keys.foreach {
      key =>
        println("Key: " + key)
        println("Value: " + myMap(key))
    }
    println(myMap.contains(80011))
    println(myMap ++ myMap2)
    println(myMap.size)
  }
}
