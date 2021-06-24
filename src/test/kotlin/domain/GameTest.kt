package domain

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

    @Test
    fun `should display 15 - 0 when player one scored`() {
        val game = Game()

        game.playerOneScored()
        val gameScore = game.displayScore()

        assertThat(gameScore.playerOne).isEqualTo(15)
        assertThat(gameScore.playerTwo).isEqualTo(0)
    }

    @Test
    fun `should display 0 - 15 when player two scored`() {
        val game = Game()

        game.playerTwoScored()
        val gameScore = game.displayScore()

        assertThat(gameScore.playerOne).isEqualTo(0)
        assertThat(gameScore.playerTwo).isEqualTo(15)
    }
}
