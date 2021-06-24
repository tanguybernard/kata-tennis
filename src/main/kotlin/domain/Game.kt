package domain

class Game {

    private val playerOne = Player()
    private val playerTwo = Player()

    fun displayScore(): GameScore {
        return GameScore(playerOne.getScore(), playerTwo.getScore())
    }

    fun playerOneScored() {
        playerOne.score()
    }

    fun playerTwoScored() {
        playerTwo.score()
    }
}
