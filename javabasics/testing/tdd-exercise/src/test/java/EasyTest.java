import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyTest {

    @Test
    void sum_ShouldReturnFive_WneTwoAndThreeAreGiven() {
        int expected = 5;
        assertEquals(expected, Easy.sum(2, 3));
    }
}