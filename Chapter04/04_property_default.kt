    class Fruit(var weight: Double) { 
        val isHeavy = weight > 20 
    } 
	
fun main(args: Array<String>) {
    var fruit = Fruit(7.0) 
    println(fruit.isHeavy)
    fruit.weight = 30.5 
    println(fruit.isHeavy)
}