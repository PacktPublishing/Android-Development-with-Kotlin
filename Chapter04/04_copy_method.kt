data class Product(var name: String, var price: Double) 
	
fun main(args: Array<String>) {
    val productA = Product("Spoon", 30.2) 
    print(productA)
    val productB = productA.copy() 
    print(productB)
}