fun main(args: Array<String>) {
	val ball = Ball(12, "Red") 
    println(ball) // prints: Ball(size=12, color=Red) 
    val smallBall = ball.copy(size = 3) 
    println(smallBall) // prints: Ball(size=3, color=Red) 
    smallBall.size++ 
    println(smallBall) // prints: Ball(size=4, color=Red) 
    println(ball) // prints: Ball(size=12, color=Red) 
}