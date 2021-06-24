import domain.Player
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlayerTest {

    @Test
    fun shouldDisplaySomething(){
        val test = "toto"
        assertThat(test).isEqualTo("toto")
    }

    @Test
    fun `player initial score should be 0`(){
        val player = Player()
        assertThat(player.getScore()).isEqualTo(0)
    }

    @Test
    fun `player score should be 15 when player scored`() {
        val player = Player()
        player.score()
        assertThat(player.getScore()).isEqualTo(15)
    }

    @Test
    fun `player score should be 30 when player scored twice`() {
        val player = Player()
        player.score()
        player.score()
        assertThat(player.getScore()).isEqualTo(30)
    }
}
