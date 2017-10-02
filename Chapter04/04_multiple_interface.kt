    interface A { 
        fun foo() { 
            println("A") 
        } 
    } 
 
    interface B { 
        fun foo() { 
            println("B") 
        } 
    } 
	class Item : A, B { 
        override fun foo() { 
            println("Item") 
        } 
    } 
	
fun main(args: Array<String>) {
	val item = Item() 
    item.foo()
}