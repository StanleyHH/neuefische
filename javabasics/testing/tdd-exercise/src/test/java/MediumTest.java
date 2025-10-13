import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediumTest {

    @Test
    void reverseString_ShouldReturnReversedText_WhenTextIsGiven() {
        String text = "Java";
        String expected = "avaJ";
        assertEquals(expected, Medium.reverseString(text));
    }

    @Test
    void isPalindrome_ShouldReturnTrue_WhenOttoGiven() {
        assertTrue(Medium.isPalindrome("Otto"));
    }

    @Test
    void countVowels_ShouldReturn2_WhenHalloIsGiven() {
        int expected = 2;
        assertEquals(expected, Medium.countVowels("Hallo"));
    }
}