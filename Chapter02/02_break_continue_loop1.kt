fun main(args: Array<String>) {
    val intRange = 1..6 
    val charRange = 'A'..'B' 
 
    for(value in intRange) { 
        if(value == 3) 
            break 
 
        println("Outer loop: $value ") 
 
        for (char in charRange) { 
            println("\tInner loop: $char ") 
        } 
    } 
}