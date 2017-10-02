fun addElement(mutableList: MutableList<Any>) {
    mutableList.add("Cat")
}

fun main(args: Array<String>) {
    val mutableIntList = mutableListOf(1, 2, 3, 4)
    val mutableAnyList = mutableListOf<Any>(1, 'A')
    addElement(mutableIntList)
    addElement(mutableIntList)
}