fun main(args: Array<String>) {
    val fruits = listOf("Babana", "Orange", "Apple", "Blueberry") 
    val bFruits = fruits.filter { it.startsWith("B") } 
    println(bFruits)
}