import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

public class calculatorTest {

    @Test
    public void testSubtract(){
        int a = 4321;
        int b = 1234;

        calculator cal = new calculator();
        int actual = cal.subtract(a, b);
        int expected = 3087;
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply(){
        int a = 10;
        int b = 100;
        calculator cal = new calculator();
        int actual = cal.multiply(a, b);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide(){
        int a = 100;
        int b = 10;
        calculator cal = new calculator();
        int actual = cal.divide(a, b);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception{
        //TODO
    }
}
