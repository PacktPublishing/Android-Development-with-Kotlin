fun main(args: Array<String>) { 
    var title1: String = "Kotlin"
    var title2: Any = "Kotlin" 
    title2 = 12
	var pair = "Everest" to 8848      // Create pair using to infix method 
    var pair2 = Pair("Everest", 8848) // Create Pair using constructor 
    var map = mapOf("Mount Everest" to 8848, "K2" to "4017")
    var age_i: Int = 18
    var age_s: Short = 18
    var age_l1: Long = 18 // Explicitly define variable type
    var age_l2 = 18L      // Use literal constant to specify value type   
}