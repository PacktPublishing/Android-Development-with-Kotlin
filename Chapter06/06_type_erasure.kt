package test
class Box<T>

val intBox = Box<Int>()
val stringBox = Box<String>()

fun main(args: Array<String>) {
    println(intBox.javaClass) 
    println(stringBox.javaClass)
}