open class Animal(val name: String)
class Dog(name: String): Animal(name)

fun present(animal: Animal) {
    println( "This is ${ animal. name } " )
}

fun main(args: Array<String>) {
    present(Dog( "Pluto" ))
}