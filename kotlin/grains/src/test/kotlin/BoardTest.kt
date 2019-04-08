import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.math.BigInteger

class BoardTest {
    @Test
    fun testSquare1ContainsCorrectNumberOfGrains() {
        Board.getGrainCountForSquare(1).toInt() `should be equal to` BigInteger.ONE.toInt()
    }

    @Test
    fun testSquare2ContainsCorrectNumberOfGrains() {
        Board.getGrainCountForSquare(2).toInt() `should be equal to`  BigInteger.valueOf(2).toInt()
    }

    @Test
    fun testSquare3ContainsCorrectNumberOfGrains() {
        Board.getGrainCountForSquare(3).toInt() `should be equal to` BigInteger.valueOf(4).toInt()
    }

    @Test
    fun testSquare4ContainsCorrectNumberOfGrains() {
        Board.getGrainCountForSquare(4).toInt() `should be equal to` BigInteger.valueOf(8).toInt()
    }

    @Test
    fun testSquare16ContainsCorrectNumberOfGrains() {
        Board.getGrainCountForSquare(16).toInt() `should be equal to`  BigInteger.valueOf(32768).toInt()
    }

    @Test
    fun testSquare32ContainsCorrectNumberOfGrains() {
        Board.getGrainCountForSquare(32).toInt() `should be equal to` BigInteger.valueOf(2147483648).toInt()
    }

    @Test
    fun testSquare64ContainsCorrectNumberOfGrains() {
        Board.getGrainCountForSquare(64).toInt() `should be equal to` BigInteger("9223372036854775808").toInt()
    }

    @Test
    fun testBoardContainsCorrectNumberOfGrains() {
        Board.getTotalGrainCount().toInt() `should be equal to`  BigInteger("18446744073709551615").toInt()
    }

    @Test
    fun testSquare0IsInvalid() {
        assertThrows<java.lang.IllegalArgumentException>("should throw IllegalArgumentEx") {
            Board.getGrainCountForSquare(0)
        }.message?.`should be equal to`("Only integers between 1 and 64 (inclusive) are allowed")
    }

    @Test
    fun testNegativeSquareIsInvalid() {
        assertThrows<java.lang.IllegalArgumentException>("should throw IllegalArgumentEx") {
            Board.getGrainCountForSquare(-1)
        }.message?.`should be equal to`("Only integers between 1 and 64 (inclusive) are allowed")
    }

    @Test
    fun testSquareGreaterThan64IsInvalid() {
        assertThrows<java.lang.IllegalArgumentException>("should throw IllegalArgumentEx") {
            Board.getGrainCountForSquare(65)
        }.message?.`should be equal to`("Only integers between 1 and 64 (inclusive) are allowed")
    }

}
