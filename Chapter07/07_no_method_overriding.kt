class A { 
    fun foo() { 
        println("foo from A") 
    } 
} 

fun A.foo() { 
    println("foo from Extension") 
}

fun main(args: Array<String>) {
    A().foo()
}