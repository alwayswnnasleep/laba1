package Tests;

import demo.parallel.Complex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestOperations {

    @Test
    public void testAddition() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex result = c1.plus(c2);

        assertEquals(new Complex(4, 6), result);
    }

    @Test
    public void testSubtraction() {
        Complex c1 = new Complex(5, 7);
        Complex c2 = new Complex(2, 3);
        Complex result = c1.minus(c2);

        assertEquals(new Complex(3, 4), result);
    }

    @Test
    public void testMultiplication() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex result = c1.times(c2);

        assertEquals(new Complex(-5, 10), result);
    }


    @Test
    public void testDivisionByZero() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(0, 0);

        assertThrows(ArithmeticException.class, () -> {
            c1.divide(c2);
        });
    }

    @Test
    public void testLengthSQ() {
        Complex c = new Complex(3, 4);
        double result = c.lengthSQ();

        assertEquals(25, result);
    }

    @Test
    public void testEquality() {
        Complex c1 = new Complex(1, 1);
        Complex c2 = new Complex(1, 1);

        assertEquals(c1, c2);
    }

    @Test
    public void testInequality() {
        Complex c1 = new Complex(1, 1);
        Complex c2 = new Complex(2, 1);

        assertNotEquals(c1, c2);
    }
}