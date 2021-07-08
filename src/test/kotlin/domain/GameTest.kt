package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GameTest {

    @Test
    fun `should display both players initial score`() {
        val game = Game()

        assertThat(game.printScore()).isEqualTo("love-love")
    }

    @Test
    fun `should display 15 - 0 when player one scored`() {
        val game = Game()

        game.playerOneScored()

        assertThat(game.printScore()).isEqualTo("15-love")
    }

    @Test
    fun `should display 0 - 15 when player two scored`() {
        val game = Game()

        game.playerTwoScored()

        assertThat(game.printScore()).isEqualTo("love-15")
    }

}
