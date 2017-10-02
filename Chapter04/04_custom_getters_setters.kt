    class Fruit(var weight: Double) { 
        var ecoRating: Int = 3 
        get() { 
            println("getter value retrieved") 
            return field 
        } 
        set(value) { 
            field = if (value < 0) 0 else value 
            println("setter new value assigned $field") 
        } 
    }
	
fun main(args: Array<String>) {
    val fruit = Fruit(12.0) 
    val ecoRating = fruit.ecoRating 
    fruit.ecoRating = 3; 
    fruit.ecoRating = -5;
}