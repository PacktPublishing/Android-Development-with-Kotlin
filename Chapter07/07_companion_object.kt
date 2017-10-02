class A { 
    companion object {} 
} 
fun A.Companion.foo() { print(2) }
fun main(args: Array<String>) {
    A.foo()
}