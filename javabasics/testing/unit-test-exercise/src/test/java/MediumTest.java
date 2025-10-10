import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediumTest {

    @Test
    void getFirstLetter_ValidString_ReturnsNotNull() {
        String text = "test";
        assertNotNull(Medium.getFirstLetter(text));
    }

    @Test
    void getFirstLetter_ValidString_ReturnsFirstLetter() {
        String text = "test";
        assertEquals('t', Medium.getFirstLetter(text));
    }

    @Test
    void getFirstLetter_Null_ReturnsNull() {
        String text = null;
        assertNull(Medium.getFirstLetter(text));
    }

    @Test
    void divide_DivisionByZero_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Medium.divide(4, 0));
    }

    @Test
    void divide_TwoPositiveNumbers_ReturnsExpectedValue() {
        int a = 5;
        int b = 2;
        double result = 2.5;

        assertEquals(result, Medium.divide(a, b));
    }

    @Test
    void divide_TwoNegativeNumbers_ReturnsExpectedValue() {
        int a = -5;
        int b = -2;
        double result = 2.5;

        assertEquals(result, Medium.divide(a, b));
    }

    @Test
    void divide_ZeroDividedByNonZero_ReturnsZero() {
        int a = 0;
        int b = 3;
        double result = 0;

        assertEquals(result, Medium.divide(a, b));
    }
}