import org.amshove.kluent.`should equal`
import org.junit.jupiter.api.Test

class MatrixTest {
    @Test
    fun testCanIdentifySingleSaddlePoint() {
        Matrix(listOf(
            listOf(9, 8, 7),
            listOf(5, 3, 2),
            listOf(6, 6, 7)
        )).saddlePoints `should equal` setOf(MatrixCoordinate(1, 0))
    }

    @Test
    fun testCanIdentifyThatEmptyMatrixHasNoSaddlePoints() {
        Matrix(listOf(emptyList())).saddlePoints `should equal` emptySet()
    }

    @Test
    fun testCanIdentifyLackOfSaddlePointsWhenThereAreNone() {
        Matrix(listOf(
            listOf(1, 2, 3),
            listOf(3, 1, 2),
            listOf(2, 3, 1)
        )).saddlePoints `should equal` emptySet()
    }

    @Test
    fun testCanIdentifyMultipleSaddlePoints() {
        Matrix(listOf(
            listOf(4, 5, 4),
            listOf(3, 5, 5),
            listOf(1, 5, 4)
        )).saddlePoints `should equal` setOf(
            MatrixCoordinate(0, 1),
            MatrixCoordinate(1, 1),
            MatrixCoordinate(2, 1)
        )
    }

    @Test
    fun testCanIdentifySaddlePointInBottomRightCorner() {
        Matrix(listOf(
            listOf(8, 7, 9),
            listOf(6, 7, 6),
            listOf(3, 2, 5)
        )).saddlePoints `should equal` setOf(MatrixCoordinate(2, 2))
    }
}
