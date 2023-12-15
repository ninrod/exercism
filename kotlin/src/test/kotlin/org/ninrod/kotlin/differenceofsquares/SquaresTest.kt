import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class SquaresTest {
    @Test
    fun squareOfSum1() {
        1 `should be equal to`  Squares(1).squareOfSum()
    }

    @Test
    fun squareOfSum5() {
        225 `should be equal to`  Squares(5).squareOfSum()
    }

    @Test
    fun squareOfSum100() {
        25502500 `should be equal to`  Squares(100).squareOfSum()
    }

    @Test
    fun sumOfSquares1() {
        1 `should be equal to`  Squares(1).sumOfSquares()
    }

    @Test
    fun sumOfSquares5() {
        55 `should be equal to`  Squares(5).sumOfSquares()
    }

    @Test
    fun sumOfSquares100() {
        338350 `should be equal to`   Squares(100).sumOfSquares()
    }

    @Test
    fun differenceOfSquares1() {
        0 `should be equal to`  Squares(1).difference()
    }

    @Test
    fun differenceOfSquares5() {
        170 `should be equal to`  Squares(5).difference()
    }

    @Test
    fun differenceOfSquares100() {
        25164150 `should be equal to`  Squares(100).difference()
    }

}
