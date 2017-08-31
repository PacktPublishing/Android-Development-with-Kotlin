fun main(args: Array<String>) {
    printValue("str", true, "","")
    printValue("str")
    printValue("str", false)
}

fun printValue(value: String, inBracket: Boolean = true, prefix: String = "", suffix: String = "") { 
    print(prefix) 
    if (inBracket) { 
        print("(${value})") 
    } else { 
        print(value) 
    } 
    println(suffix) 
}