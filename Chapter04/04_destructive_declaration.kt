data class Person(val firstName: String, val lastName: String, val height: Int) 
	
fun main(args: Array<String>) {
    val person = Person("Igor", "Wojda", 180) 
    var (firstName, lastName, height) = person 
    println(firstName)  
    println(height)
}