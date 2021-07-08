package domain

import java.lang.IllegalArgumentException

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
        if(playerOneScore == 4) return "advantage player one"
        return if (playerOneScore == 3 && playerTwoScore == 3) "deuce"
        else "${printPlayerScore(playerOneScore)}-${printPlayerScore(playerTwoScore)}"
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
