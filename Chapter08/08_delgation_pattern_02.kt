interface Player { 
        fun playGame() 
    } 
 
    interface GameMaker { 
        fun developGame() 
    } 
 
    class WitcherPlayer(val enemy: String) : Player { 
        override fun playGame() { 
            print("Killin $enemy! ") 
        } 
    } 
 
    class WitcherCreator(val gameName: String) : GameMaker{ 
        override fun developGame() { 
            println("Makin $gameName! ") 
        } 
    } 
 
    class WitcherPassionate : 
        Player by WitcherPlayer("monsters"), 
        GameMaker by WitcherCreator("Witcher 3") { 
 
        fun fulfillYourDestiny() { 
            playGame() 
            developGame() 
        } 
    }
fun main(args: Array<String>) {
	WitcherPassionate().fulfillYourDestiny()
}
	