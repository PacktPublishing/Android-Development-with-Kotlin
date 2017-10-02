fun main(args: Array<String>) {
    val mutableList = mutableListOf(1) 
    val mutableList = mutableListOf(1)
    val letResult = mutableList.let {
        it.add(2)
        listOf("A", "B", "C")
    }
    println(letResult) // Prints: [A, B, C]
    val applyResult = mutableList.apply {
        add(3)
        listOf("A", "B", "C")
    }
    println(applyResult) // Prints: [1, 2, 3]
    val alsoResult = mutableList.also {
       it.add(4)
       listOf("A", "B", "C")
    }
    println(alsoResult) // Prints: [1, 2, 3, 4]
    val runResult = mutableList.run {
       add(5)
       listOf("A", "B", "C")
    }
    println(runResult) // Prints: [A, B, C]
    val withResult = with(mutableList) {
       add(6)
       listOf("A", "B", "C")
    }
    println(withResult) // Prints: [A, B, C]
    println(mutableList) // Prints: [1, 2, 3, 4, 5, 6]
}