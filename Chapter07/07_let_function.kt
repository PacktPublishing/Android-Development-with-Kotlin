    val text = "hello {name}" 
 
    fun correctStyle(text: String) = text 
       .replace("hello", "hello,") 
 
    fun greet(name: String) { 
        text.replace("{name}", name) 
           .let { correctStyle(it) } 
           .capitalize() 
           .let { print(it) } 
    }

	
fun main(args: Array<String>) {
	greet("reader")
}