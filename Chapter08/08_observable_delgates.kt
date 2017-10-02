var name: String by Delegates.observable("Empty"){ 
    property, oldValue, newValue -> 
    println("$oldValue -> $newValue")  
}

fun main(args: Array<String>) {
	name = "Martin"
	name = "Igor"
	name = "Igor"
}
