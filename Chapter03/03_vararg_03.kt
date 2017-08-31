fun main(args: Array<String>) {
    val texts = arrayOf("B", "C", "D") 
    printAll(*texts)
    printAll("A", *texts, "E")
}
fun printAll(vararg texts: Any) { 
    val allTexts = texts.joinToString(",") // 1 
    println(allTexts) 
}