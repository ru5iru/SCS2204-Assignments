case class Point(var x: Int, var y: Int) {
    def add(a: Point) = new Point(this.x + a.x, this.y + a.y)

    def move(x: Int, y: Int):Unit = {
        this.x = this.x + x
        this.y = this.y + y
    }

    def distance(a: Point) : Double = {
        var x_Dist: Int = this.x - a.x
        var y_Dist: Int = this.y - a.y
        var dist: Int = x_Dist*x_Dist + y_Dist*y_Dist
        scala.math.sqrt(dist)
    }

    def invert() :Unit = {
        var temp = this.x
        this.x = this.y
        this.y = temp
    }
}

object Point extends App {

    var a = Point(2,3)
    var b = Point(7,14)
    
    println(a.add(b))

    a.move(x = 3, y = 7)
    println(a)
    
    var c = a.distance(b)
    println(c)

    a.invert()
    println(a)
}