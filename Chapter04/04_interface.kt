    interface EmailProvider { 
 
        val email: String 
 
        val nickname: String 
        get() = email.substringBefore("@") 
 
        fun validateEmail() = nickname.isNotEmpty() 
    } 
 
    class User(override val email: String) : EmailProvider 
	
fun main(args: Array<String>) {
	val user = User("joey@test.com")
    print(user.validateEmail())
    print(user.nickname)
}