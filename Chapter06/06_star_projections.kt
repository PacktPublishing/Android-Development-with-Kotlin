fun printSize(list: MutableList<*>) {
    println(list.size)
}

fun main(args: Array<String>) {
    val stringList = mutableListOf("5", "a", "2", "d")
    val intList = mutableListOf(3, 7)
    printSize(stringList) 
    printSize(intList)
}