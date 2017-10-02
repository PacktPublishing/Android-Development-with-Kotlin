data class Point(var x: Double, var y: Double) { 
   operator fun plus(point: Point) = Point(x + point.x, y+ point.y)  
   operator fun times(other: Int) = Point(x * other, y * other) 
} 
	
fun main(args: Array<String>) {
	var p1 = Point(2.9, 5.0) 
	var p2 = Point(2.0, 7.5)
    println(p1 + p2)  
	println(p1 * 3) 
}