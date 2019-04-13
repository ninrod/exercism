import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class SpaceAgeTest {
    @Test
    fun ageOnEarth() {
        31.69 `should be equal to` SpaceAge(1000000000).onEarth()
    }

    @Test
    fun ageOnMercury() {
        280.88 `should be equal to` SpaceAge(2134835688).onMercury()
    }

    @Test
    fun ageOnVenus() {
        9.79 `should be equal to` SpaceAge(189839836).onVenus()
    }

    @Test
    fun ageOnMars() {
        39.25 `should be equal to` SpaceAge(2329871239L).onMars()
    }

    @Test
    fun ageOnJupiter() {
        2.41 `should be equal to` SpaceAge(901876382).onJupiter()
    }

    @Test
    fun ageOnSaturn() {
        3.23 `should be equal to` SpaceAge(3000000000L).onSaturn()
    }

    @Test
    fun ageOnUranus() {
        1.21 `should be equal to` SpaceAge(3210123456L).onUranus()
    }

    @Test
    fun ageOnNeptune() {
        1.58 `should be equal to` SpaceAge(8210123456L).onNeptune()
    }
}
