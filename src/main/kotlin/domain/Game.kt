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
        if (playerTwo.getScore() == Score.FIFTEEN) return "love-15"
        if (playerOne.getScore() == Score.FIFTEEN) return "15-love"
        return "love-love"
    }
}
