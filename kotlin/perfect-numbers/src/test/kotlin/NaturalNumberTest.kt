import org.amshove.kluent.`should be`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.RuntimeException

class NaturalNumberTest {
    @Test
    fun smallPerfectNumberIsClassifiedCorrectly() {
        Classification.PERFECT `should be`  classify(6)
    }

    @Test
    fun mediumPerfectNumberIsClassifiedCorrectly() {
        Classification.PERFECT `should be`  classify(28)
    }

    @Test
    fun largePerfectNumberIsClassifiedCorrectly() {
        Classification.PERFECT `should be`  classify(33550336)
    }

    @Test
    fun smallAbundantNumberIsClassifiedCorrectly() {
        Classification.ABUNDANT `should be`  classify(12)
    }

    @Test
    fun mediumAbundantNumberIsClassifiedCorrectly() {
        Classification.ABUNDANT `should be`  classify(30)
    }

    @Test
    fun largeAbundantNumberIsClassifiedCorrectly() {
        Classification.ABUNDANT `should be`  classify(33550335)
    }

    @Test
    fun smallestPrimeDeficientNumberIsClassifiedCorrectly() {
        Classification.DEFICIENT `should be`  classify(2)
    }

    @Test
    fun smallestNonPrimeDeficientNumberIsClassifiedCorrectly() {
        Classification.DEFICIENT `should be`  classify(4)
    }

    @Test
    fun mediumNumberIsClassifiedCorrectly() {
        Classification.DEFICIENT `should be`  classify(32)
    }

    @Test
    fun largeDeficientNumberIsClassifiedCorrectly() {
        Classification.DEFICIENT `should be`  classify(33550337)
    }

    @Test
    fun edgeCaseWithNoFactorsOtherThanItselfIsClassifiedCorrectly() {
        Classification.DEFICIENT `should be`  classify(1)
    }

    @Test
    fun zeroIsNotANaturalNumber() {
        assertThrows<java.lang.RuntimeException> {
            classify(0)
        }
    }

    @Test
    fun negativeNumberIsNotANaturalNumber() {
        assertThrows<RuntimeException> {
            classify(-1)
        }
    }
}
