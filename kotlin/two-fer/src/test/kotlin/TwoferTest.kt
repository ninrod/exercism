import org.junit.jupiter.api.Test
import org.amshove.kluent.`should be equal to`

class TwoferTest {

    @Test
    fun noNameGiven() {
        twofer() `should be equal to` "One for you, one for me."
    }

    @Test
    fun aNameGiven() {
        twofer("Alice") `should be equal to` "One for Alice, one for me."
    }

    @Test
    fun anotherNameGiven() {
        "One for Bob, one for me." `should be equal to`  twofer("Bob")
    }

    @Test
    fun emptyStringGiven() {
        "One for , one for me." `should be equal to`  twofer("")
    }

}
