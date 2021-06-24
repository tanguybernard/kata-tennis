package domain

class Player {
    private var score = 0

    fun getScore(): Int {
        return score
    }

    fun score() {
        score += 15
    }
}
