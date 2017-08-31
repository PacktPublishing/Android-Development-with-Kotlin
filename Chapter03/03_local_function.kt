fun main(args: Array<String>) {
	printTwoThreeTimes()
}
fun printTwoThreeTimes() { 
    fun printThree() { // 1 
        print(3) 
    } 
    printThree() // 2 
    printThree() // 2 
} 