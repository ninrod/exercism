import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class RaindropsTest {
    @Test
    fun test() {
        Raindrops.convert(1) `should be equal to`  "1"
        Raindrops.convert(3) `should be equal to` "Pling"
        Raindrops.convert(5) `should be equal to` "Plang"
        Raindrops.convert(7) `should be equal to` "Plong"
        Raindrops.convert(6) `should be equal to` "Pling"
        Raindrops.convert(8) `should be equal to` "8"
        Raindrops.convert(9) `should be equal to` "Pling"
        Raindrops.convert(10) `should be equal to` "Plang"
        Raindrops.convert(14) `should be equal to` "Plong"
        Raindrops.convert(15) `should be equal to` "PlingPlang"
        Raindrops.convert(21) `should be equal to` "PlingPlong"
        Raindrops.convert(25) `should be equal to` "Plang"
        Raindrops.convert(27) `should be equal to` "Pling"
        Raindrops.convert(35) `should be equal to` "PlangPlong"
        Raindrops.convert(49) `should be equal to` "Plong"
        Raindrops.convert(52) `should be equal to` "52"
        Raindrops.convert(105) `should be equal to` "PlingPlangPlong"
        Raindrops.convert(3125) `should be equal to` "Plang"
    }
}
