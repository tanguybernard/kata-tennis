package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.test.Ignore

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

    @Test
    fun `should display 15 - 15 when both scored`() {
        val game = Game()

        game.playerTwoScored()
        game.playerOneScored()

        assertThat(game.printScore()).isEqualTo("15-15")
    }

    @Test
    fun `should display 30 - 15 when player one scored two times and player two once`() {
        val game = Game()

        game.playerTwoScored()
        game.playerOneScored()
        game.playerOneScored()

        assertThat(game.printScore()).isEqualTo("30-15")
    }

    @Test
    fun `should display 40 - 0 when player one scored three times and player two zero`() {
        val game = Game()

        game.playerOneScored()
        game.playerOneScored()
        game.playerOneScored()

        assertThat(game.printScore()).isEqualTo("40-love")
    }

    @Test
    fun `should display "deuce" when player one and two made an equality`() {
        val game = Game()

        game.playerOneScored()
        game.playerOneScored()
        game.playerOneScored()

        game.playerTwoScored()
        game.playerTwoScored()
        game.playerTwoScored()

        assertThat(game.printScore()).isEqualTo("deuce")
    }

    @Test
    @Ignore
    fun `should display "advantage player one" when player one have score after deuce`() {
        val game = Game()

        game.playerOneScored()
        game.playerOneScored()
        game.playerOneScored()

        game.playerTwoScored()
        game.playerTwoScored()
        game.playerTwoScored()

        game.playerOneScored()

        assertThat(game.printScore()).isEqualTo("advantage player one")
    }


}
