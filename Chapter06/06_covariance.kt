fun printElements(list: List<Any>) {
    for(e in list) print(e)
}

fun main(args: Array<String>) {
    val intList = listOf(1, 2, 3, 4)
    val anyList = listOf<Any>(1, 'A')
    printElements(intList)
    printElements(anyList)
}