fun main(args: Array<String>) {
    val capitols = listOf("England" to "London", "Poland" to "Warsaw") 
    for ((country, city) in capitols) { 
        println("Capitol of $country is $city") 
    } 
}