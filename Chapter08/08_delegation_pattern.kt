interface Player { 
	fun playGame() 
} 
 
class RpgGamePlayer(val enemy: String) : Player { 
	override fun playGame() { 
		println("Killing $enemy") 
	} 
} 
 
class WitcherPlayer(enemy: String) : Player { 
	val player = RpgGamePlayer(enemy) 
   
	override fun playGame() { 
		player.playGame()
	} 
}

fun main(args: Array<String>) {
    RpgGamePlayer("monsters").playGame()
	WitcherPlayer("monsters").playGame()
}