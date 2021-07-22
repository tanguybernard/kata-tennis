package domain

class Game {

    private var playerOneScore = 0
    private var playerTwoScore = 0

    fun playerOneScored() {
        playerOneScore++
    }

    fun playerTwoScored() {
        playerTwoScore++
    }

    fun printScore(): String {
        fromAdvantageToDeuce()
        if (playerOneScore == 5 || (playerOneScore == 4 && playerTwoScore < 3)) return "player one wins"
        if (playerTwoScore == 5 ||  (playerTwoScore == 4 && playerOneScore < 3)) return "player two wins"
        if (playerOneScore == 4) return "advantage player one"
        if (playerTwoScore == 4) return "advantage player two"
        return if (playerOneScore == 3 && playerTwoScore == 3) "deuce"
        else "${printPlayerScore(playerOneScore)}-${printPlayerScore(playerTwoScore)}"
    }

    private fun fromAdvantageToDeuce() {
        if (playerOneScore == 4 && playerTwoScore == 4) {
            playerOneScore--
            playerTwoScore--
        }
    }

    private fun printPlayerScore(score: Int): String {
        return when (score) {
            0 -> "love"
            1 -> "15"
            2 -> "30"
            3 -> "40"
            else -> throw IllegalArgumentException()
        }
    }
}
