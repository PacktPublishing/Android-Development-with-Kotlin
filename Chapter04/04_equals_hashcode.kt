data class Product(var name:String, var price:Double) 
	
fun main(args: Array<String>) {
    val productA = Product("Spoon", 30.2) 
    val productB = Product("Spoon", 30.2) 
    val productC = Product("Fork", 17.4)
	print(productA == productA)  
    print(productA == productB) 
    print(productB == productA)
    print(productA == productC)
    print(productB == productC) 
}