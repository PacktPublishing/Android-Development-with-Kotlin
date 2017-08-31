fun main(args: Array<String>) {
    printSum(1,2,3,4,5)
    printSum()
}

fun printSum(vararg numbers: Int) { 
    val sum = numbers.sum() 
    print(sum) 
} 