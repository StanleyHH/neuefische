import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BonusTest {

    @Test
    void isPrime_ThreePrimeNumbers_ReturnsTrue() {
        int a = 7057;
        int b = 13309;
        int c = 1699;

        assertTrue(Bonus.isPrime(a));
        assertTrue(Bonus.isPrime(b));
        assertTrue(Bonus.isPrime(c));
    }

    @Test
    void isPrime_ThreeNotPrimeNumbers_ReturnsFalse() {
        int a = 3452;
        int b = 3543;
        int c = 729;

        assertFalse(Bonus.isPrime(a));
        assertFalse(Bonus.isPrime(b));
        assertFalse(Bonus.isPrime(c));
    }
}
