package domain

import Score

class GameScore(var playerOne: Score, var playerTwo: Score) {
    fun printScore(): String {
        return "love-love"
    }
}
