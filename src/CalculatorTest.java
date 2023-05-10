import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void alwaysPassTest() {
        assertTrue(true);
    }
    @Test
    public void twoPlusTwoEqualsFour() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }
    @Test
    public void fivePlusSevenEqualsTwelve() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.add(5, 7));
    }
}
