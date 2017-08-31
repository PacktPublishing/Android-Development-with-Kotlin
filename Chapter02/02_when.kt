fun main(args: Array<String>) {
    val vehicle = "Bike" 
 
    val message= when (vehicle) { 
        "Car" -> { 
            // Some code 
            "Four wheels" 
        } 
        "Bike" -> { 
            // Some code 
            "Two wheels" 
        } 
        else -> { 
            //some code 
            "Unknown number of wheels" 
        } 
    } 
 
    println(message) //Prints: Two wheels
}