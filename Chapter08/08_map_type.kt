class User(map: Map<String, Any>) {  
    val name: String by map 
    val kotlinProgrammer: Boolean by map 
}

fun main(args: Array<String>) {
    val map: Map<String, Any> = mapOf(
        "name" to "Marcin", 
        "kotlinProgrammer" to true 
    ) 
    val user = User(map) 
    println(user.name)  
    println(user.kotlinProgrammer)   
}