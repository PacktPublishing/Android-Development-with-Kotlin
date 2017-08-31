fun main(args: Array<String>) {
    printAll("A", "B", "C")
}

fun printAll(vararg texts: String) { // 1 
    val allTexts = texts.joinToString(",") 
    println("Texts are $allTexts") 
}