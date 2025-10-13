import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyTest {

    @Test
    void sum_ShouldReturnFive_WneTwoAndThreeAreGiven() {
        int expected = 5;
        assertEquals(expected, Easy.sum(2, 3));
    }

    @Test
    void isEven_ShouldReturnTrue_WhenNumberIsEven() {
        assertTrue(Easy.isEven(668));
    }

    @Test
    void isEven_ShouldReturnFalse_WhenNumberIsOdd() {
        assertFalse(Easy.isEven(443));
    }

    @Test
    void getFirstCharacter_ShouldReturnH_WhenStringIsHallo() {
        char expected = 'H';
        assertEquals(expected, Easy.getFirstCharacter("Hallo"));
    }
}