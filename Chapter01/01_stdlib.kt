fun main(args: Array<String>) {
	val text = capitols.map { (country, _) -> country.toUpperCase() } 
                       .onEach { println(it) } 
                       .filter { it.startsWith("P") } 
                       .joinToString (prefix = "Countries starting from P are: ") 
    // Prints: ENGLAND POLAND
    println(text) // Prints: Countries starting from P are POLAND 
}