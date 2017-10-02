open class Action
class ActionGroup<T : Action?>(private val list: List<T>) {
    fun lastOrNull(): T? = list.lastOrNull()
}

fun main(args: Array<String>) {
	val actionGroup = ActionGroup(listOf(Action(), null))
    println(actionGroup.lastOrNull())
}