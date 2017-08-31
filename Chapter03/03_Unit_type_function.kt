fun main(args: Array<String>) {
    val p = printSum(1, 2) 
    println(p is Unit)
}
fun printSum(a: Int, b: Int): Unit{ 
	val sum = a + b
}