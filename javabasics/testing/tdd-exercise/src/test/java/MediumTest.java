import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediumTest {

    @Test
    void reverseString_ShouldReturnReversedText_WhenTextIsGiven() {
        String text = "Java";
        String expected = "avaJ";
        assertEquals(expected, Medium.reverseString(text));
    }
}