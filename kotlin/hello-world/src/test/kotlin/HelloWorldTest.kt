import org.junit.jupiter.api.Test
import org.amshove.kluent.`should be equal to`

class HelloWorldTest {

    @Test
    fun helloWorldTest() {
        hello() `should be equal to`  "Hello, World!"
    }

}
