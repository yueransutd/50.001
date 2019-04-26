package unittesting;

/**
 * Created by jit_biswas on 10/8/2017.
 */
import junit.framework.*;
import junit.framework.Test;

import org.junit.*;

public class TestCalculator extends TestCase {

    // constructor
    public TestCalculator (String name) {
        super(name);
    }

    @org.junit.Test
    public void testFourOperations () {
         // Enter your code here
        Calculator c = new Calculator();
        assertEquals("Failed Addition", 9, c.add(4,5));
        assertEquals("Failed Subtraction", 2, c.sub(5,3));
        assertEquals("Failed Multiplication", 42, c.mul(6,7));
        assertEquals("Failed Division", 1, c.divInt(6,4));

    }

   @org.junit.Test
    public void testDivideByZero () throws IllegalArgumentException{
        Calculator c = new Calculator();
        try {
             // Enter your code here
            assertEquals("Failed Division", 0, c.divInt(1,0));

        } catch (IllegalArgumentException e) {
            // do nothing since exception has been correctly raised
        }
    }

    // method create a test suite
    public static Test suite() {
        return new TestSuite(TestCalculator.class);
    }

    // the main method
    public static void main(String args[]) {
        junit.textui.TestRunner.run(suite());
    }
}


