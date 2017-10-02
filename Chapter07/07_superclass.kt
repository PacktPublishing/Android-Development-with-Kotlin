    open class A { 
        fun foo() { 
            println("foo from A") 
        } 
    } 
 
    class B: A() 
 
    fun B.foo() { 
        println("foo from Extension") 
    }

fun main(args: Array<String>) {
    A().foo() 
}