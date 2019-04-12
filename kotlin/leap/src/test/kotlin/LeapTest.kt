import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.jupiter.api.Test

class LeapTest {
    @Test
    fun yearNotDivisibleBy4() {
        Year(2015).isLeap.shouldBeFalse()
    }
    @Test
    fun yearDivisibleBy4NotDivisibleBy100() {
        Year(1996).isLeap.shouldBeTrue()
    }
    @Test
    fun yearDivisibleBy100NotDivisibleBy400() {
        Year(2100).isLeap.shouldBeFalse()
    }
    @Test
    fun yearDivisibleBy400() {
        Year(2000).isLeap.shouldBeTrue()
    }
}
