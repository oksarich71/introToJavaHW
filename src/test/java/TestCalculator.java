import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addNumbers() {
         assertEquals( 15, calculator.addition(8,7));
    }
    @Test
    public void substractNumbers() {
        assertEquals(1, calculator.substraction(8,7));
    }

    @Test
    public void multiplyNumbers() {
        assertEquals(56, calculator.multiply(8,7));
    }

    @Test
    public void divideNumbers() {
        assertEquals(2, calculator.divide(20,10));
    }

}
