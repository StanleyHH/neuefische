import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    @Test
    void mergeArrays_ShouldReturnArray1234_WhenArray12AndArray34AreGiven() {
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, Bonus.mergeArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}