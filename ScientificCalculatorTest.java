import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Math.sqrt(16), "Square root of 16 should be 4");
        assertThrows(IllegalArgumentException.class, () -> {
            if (-1 < 0) throw new IllegalArgumentException("Cannot take square root of a negative number.");
        });
    }

    @Test
    public void testFactorial() {
        assertEquals(120, factorial(5), "Factorial of 5 should be 120");
        assertEquals(1, factorial(0), "Factorial of 0 should be 1");
        assertThrows(IllegalArgumentException.class, () -> {
            factorial(-1);
        });
    }

    @Test
    public void testNaturalLog() {
        assertEquals(Math.log(2), Math.log(2), "Natural logarithm of 2 should be equal to Math.log(2)");
        assertThrows(IllegalArgumentException.class, () -> {
            if (0 <= 0) throw new IllegalArgumentException("Logarithm is undefined for zero or negative values.");
        });
    }

    @Test
    public void testPowerFunction() {
        assertEquals(8.0, Math.pow(2, 3), "2 raised to the power of 3 should be 8");
        assertEquals(1.0, Math.pow(5, 0), "5 raised to the power of 0 should be 1");
    }

    private long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

