package Inheritence

class Polygon {
  def area: Double = 0.0
}

object Polygon {
  def main(args: Array[String]): Unit = {
    var poly =  new Polygon
    var rect = new Rectangle(10,10)
    var tri = new Triangle(10,10)
    printArea(poly)
    printArea(rect)
    printArea(tri)
  }

  def printArea(p: Polygon): Unit = {
    println(p.area)
  }
}
