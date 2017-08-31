abstract class A
class B: A()

fun A.foo() { println("foo(A)") }
fun B.foo() { println("foo(B)") }

fun main(args: Array<String>) {
	val b = B() 
	b.foo()
	(b as A).foo()
	val a: A = b
	a.foo()
}