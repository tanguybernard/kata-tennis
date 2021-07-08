package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GameTest {

    @Test
    fun `should display both players initial score`() {
        val game = Game()

        val gameScore = game.displayScore()

        assertThat(gameScore.playerOne).isEqualTo(Score.ZERO)
        assertThat(gameScore.playerTwo).isEqualTo(Score.ZERO)
        assertThat(gameScore.printScore()).isEqualTo("love-love")
    }

    @Test
    fun `should display 15 - 0 when player one scored`() {
        val game = Game()

        game.playerOneScored()
        val gameScore = game.displayScore()

        assertThat(gameScore.playerOne).isEqualTo(Score.FIFTEEN)
        assertThat(gameScore.playerTwo).isEqualTo(Score.ZERO)
    }

    @Test
    fun `should display 0 - 15 when player two scored`() {
        val game = Game()

        game.playerTwoScored()
        val gameScore = game.displayScore()

        assertThat(gameScore.playerOne).isEqualTo(Score.ZERO)
        assertThat(gameScore.playerTwo).isEqualTo(Score.FIFTEEN)
    }

}
