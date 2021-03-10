import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
public class CalculatorTest {
    @Test
    public void twoAndThreeIsFive() throws Exception {
        final long result = new Calculator().add(2, 3);
        assertEquals(result, 5);
    }
    @Test
    public void twoAndZeroIsTwo() throws Exception {
        final long result = new Calculator().add(2, 0);
        assertEquals(result, 2);
    }
    @Test
    public void twoAndMinusTwoIsZero() throws Exception {
        final long result = new Calculator().add(2, -2);
        assertEquals(result, 0);
    }
    @Test
    public void threeMinusTwoIsOne() throws Exception {
        final long result = new Calculator().subtract(3, 2);
        assertEquals(result, 1);
    }
    @Test
    public void threeMinusThreeIsZero() throws Exception {
        final long result = new Calculator().subtract(3, 3);
        assertEquals(result, 0);
    }
    @Test
    public void threeMinusMinusThreeIsSix() throws Exception {
        final long result = new Calculator().subtract(3, -3);
        assertEquals(result, 6);
    }
    @Test
    public void threeXThreeIsNine() throws Exception {
        final long result = new Calculator().multiply(3, 3);
        assertEquals(result, 9);
    }
    @Test
    public void threeXZeroIsZero() throws Exception {
        final long result = new Calculator().multiply(3, 0);
        assertEquals(result, 0);
    }
    @Test
    public void threeXMinusThreeIsMinusNine() throws Exception {
        final long result = new Calculator().multiply(3, -3);
        assertEquals(result, -9);
    }
}
