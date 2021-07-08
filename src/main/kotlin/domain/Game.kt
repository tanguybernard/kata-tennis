package domain

class Game {

    private val playerOne = Player()
    private val playerTwo = Player()

    fun playerOneScored() {
        playerOne.score()
    }

    fun playerTwoScored() {
        playerTwo.score()
    }

    fun printScore(): String {
        return "${playerOne.getScore().value}-${playerTwo.getScore().value}"
    }
}
