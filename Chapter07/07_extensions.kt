abstract class A 
class B: A() 
 
fun A.foo() { println("foo(A)") } 
fun B.foo() { println("foo(B)") } 

fun main(args: Array<String>) {
    val b = B() 
    b.foo() // prints: foo(B) 
    (b as A).foo() // 1, prints: foo(A) 
    val a: A = b 
    a.foo() // 1, prints: foo(A)
}	