package domain

import Score

class Player {
    private var score = Score.ZERO

    fun getScore(): Score {
        return score
    }

    fun score() {
        score = score.next()
    }
}
