import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyTest {

    @Test
    void testIsPositive_PositiveNumber_ReturnsTrue() {
        int number = 6;
        boolean result = Easy.isPositive(number);
        assertTrue(result);
    }

    @Test
    void isPositive_NegativeNumber_ReturnsFalse() {
        int number = -6;
        boolean result = Easy.isPositive(number);
        assertFalse(result);
    }

    @Test
    void multiply_TwoNumbers_ReturnsCorrectProduct() {
        int result = Easy.multiply(5, -2);
        assertEquals(-10, result);
    }

    @Test
    void multiply_NumberByZero_ReturnsNull() {
        int result = Easy.multiply(23, 0);
        assertEquals(0, result);
    }
}