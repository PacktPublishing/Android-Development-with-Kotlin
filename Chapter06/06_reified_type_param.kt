interface View
class ProfileView: View
class HomeView: View
inline fun <reified T> typeCheck(s: Any) { 
    if(s is T){
    	println("The same types")
    } else {
	    println("Different types")
    }
}

fun main(args: Array<String>) {
    typeCheck<ProfileView>(ProfileView())
    typeCheck<HomeView>(ProfileView()) 
    typeCheck<View>(ProfileView()) 
}