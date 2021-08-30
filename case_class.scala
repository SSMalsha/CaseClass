import scala.io.StdIn._
import math.{pow, sqrt}

object case_class extends App{

  case class Point(a:Int, b:Int){
    def x:Int=a
    def y:Int=b

    //add two points
    def +(that:Point)=Point(this.x + that.x, this.y + that.y)
    //move a point by a given distance dx and dy
    def move(dx:Int, dy:Int)=Point(this.x+dx, this.y+dy)
    //return the distance between two points
    def distance(d: Point) : Double = { sqrt(pow(x-d.x, 2) + pow(y-d.y, 2))}
    //switch the x and y coordinates
    def invert(p:Point) = Point(p.y, p.x)
  }

  //1
  println("Enter the values of 1st point (x1,y1): ")
  val x1 = readInt()
  val y1 = readInt()
  val p1 = Point(x1,y1)

  println("Enter the values of 2nd point (x2,y2): ")
  val x2 = readInt()
  val y2 = readInt()
  val p2 = Point(x2,y2)

  print("Addition of two points = ")
  println(p1+p2)

  //2
  val p = p1+p2
  print("\nPoint before moving the given distance = ")
  println(p)
  println("Enter the distance to move(dx,dy): ")
  val dx = readInt()
  val dy = readInt()

  print("Point after moving the given distance = ")
  println(p.move(dx,dy))

  //3
  print("\n1st point = "); println(p1)
  print("2nd point = "); println(p2)

  print("Distance between the points : ")
  println(p1.distance(p2))

  //4
  println("\nEnter the point values to switch (x,y): ")
  val x = readInt()
  val y = readInt()
  val p3 = Point(x,y)

  print("Inverted point : ")
  print(p3.invert(p3))
}
