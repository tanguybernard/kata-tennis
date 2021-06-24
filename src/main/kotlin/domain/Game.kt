package domain

class Game {

    private val playerOne = Player()

    fun displayScore(): GameScore {
        return GameScore(playerOne.getScore())
    }

    fun playerOneScored() {
        playerOne.score()
    }
}
