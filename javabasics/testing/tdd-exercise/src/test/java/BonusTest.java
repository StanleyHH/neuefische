import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusTest {

    @Test
    void factorial_ShouldReturn120_When5IsGiven() {
        int expected = 120;
        assertEquals(expected, Bonus.factorial(5));
    }

    @Test
    void fibonacci_ShouldReturn8_When6IsGiven() {
        int expected = 8;
        assertEquals(expected, Bonus.fibonacci(6));
    }
}