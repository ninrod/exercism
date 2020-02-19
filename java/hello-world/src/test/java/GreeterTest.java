import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    @Test
    public void testThatGreeterReturnsTheCorrectGreeting() {
        assertEquals("Hello, World!", new Greeter().getGreeting());
    }
}
