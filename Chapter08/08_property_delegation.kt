class User(val map: MutableMap<String, Any>) { 
    var name: String by map 
    var kotlinProgrammer: Boolean by map 
 
    override fun toString(): String = "Name: $name, Kotlin programmer: $kotlinProgrammer" 
} 
fun main(args: Array<String>) {
    val map = mutableMapOf( 
    "name" to "Marcin", 
    "kotlinProgrammer" to true 
	) 
	val user = User(map) 
	println(user)  
	user.map.put("name", "Igor") 
	println(user)
	user.name = "Michal" 
	println(user) 
}