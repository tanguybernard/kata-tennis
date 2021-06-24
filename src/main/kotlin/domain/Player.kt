package domain

class Player {
    private var score = 0

    fun getScore(): Int {
        return score
    }

    fun score() {
        if (score == 30) {
            score += 10
        } else {
            score += 15
        }
    }
}
