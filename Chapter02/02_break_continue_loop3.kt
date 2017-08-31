fun main(args: Array<String>) {
    fun doSth() { 
        val charRange = 'A'..'B' 
        val intRange = 1..6 
 
        for(value in intRange) { 
            println("Outer loop: $value ") 
 
            for (char in charRange) { 
                println("\tInner loop: $char ") 
 
                return 
            } 
        }   
    } 
 
    //usage 
    println("Before method call") 
    doSth() 
    println("After method call") 
}