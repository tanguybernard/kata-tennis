import domain.Player
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestMain {

    @Test
    fun shouldDisplaySomething(){
        val test = "toto"
        assertThat(test).isEqualTo("toto")
    }

    @Test
    fun `initial Score Player Should Be 0`(){
        val player = Player()
        assertThat(player.getScore()).isEqualTo(0)

    }


}