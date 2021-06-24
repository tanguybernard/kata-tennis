package domain

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GameTest {

    @Test
    fun `should display both players initial score`() {
        val game = Game()

        val gameScore = game.displayScore()

        assertThat(gameScore.playerOne).isEqualTo(0)
        assertThat(gameScore.playerTwo).isEqualTo(0)
    }
}
