package AbstractClasses

abstract class Polygon {
  def area: Double
}

object Polygon {
  def main(args: Array[String]): Unit = {
    var rect = new Rectangle(10,10)
    var tri = new Triangle(10,10)
    printArea(rect)
    printArea(tri)
  }

  def printArea(p: Polygon): Unit = {
    println(p.area)
  }
}
