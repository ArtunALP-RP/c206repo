import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class 
calculatorTest {

    @BeforeClass
    public static void BeforeClassSetup() throws Exception{
    }

    @Before
    public void setup() throws Exception{
    }

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

    @Test
    public void testDivideWith0Denominator(){
        int a = 10;
        int b = 0;

        try {
            calculator cal = new calculator();
            cal.divide(a,b);
            fail("Expected an illegalArgumentException to be thrown");
        } catch (IllegalArgumentException ae){
            assertEquals("Division by 0 is not allowed", ae.getMessage());
        } catch(Throwable t){
            assertEquals("Expected an illegalArgumentException to be thrown", t.getMessage());
        }
    }
    
    @After
    public void complete(){
    }

    @AfterClass
    public static void stop(){
    }
}