package domain

import domain.Player
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlayerTest {

    @Test
    fun `player initial score should be 0`(){
        val player = Player()
        assertThat(player.getScore()).isEqualTo(Score.ZERO)
    }

    @Test
    fun `player score should be 15 when player scored`() {
        val player = Player()
        player.score()
        assertThat(player.getScore()).isEqualTo(Score.FIFTEEN)
    }

    @Test
    fun `player score should be 30 when player scored twice`() {
        val player = Player()
        player.score()
        player.score()
        assertThat(player.getScore()).isEqualTo(Score.THIRTY)
    }

    @Test
    fun `player score should be 40 when player scored three times`() {
        val player = Player()
        player.score()
        player.score()
        player.score()
        assertThat(player.getScore()).isEqualTo(Score.FORTY)
    }
}
