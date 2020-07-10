package com.mycompany.testingtutorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Owner
 */
public class TestingObjectTest {

    /**
     * Test of factorial method, of class TestingObject.
     */
    @Test
    public void testFactorial() throws Exception {
        assertEquals(TestingObject.factorial(0), 1, "0! == 1");
        assertEquals(TestingObject.factorial(1), 1, "1! == 1");
        assertEquals(TestingObject.factorial(2), 2, "2! == 2");
        assertEquals(TestingObject.factorial(3), 6, "3! == 6");
        assertEquals(TestingObject.factorial(4), 24, "4! == 24");
        assertEquals(TestingObject.factorial(5), 120, "5! == 120");
        
        try
        {
            int ret = TestingObject.factorial(-1);
            fail("Testing object returned " + ret + "for < factorial(-1) > when exception should be thrown!");
        }
        catch (Exception e)
        {
           //Intentionally empty
        }
        
        
    }

    /**
     * Test of gcd method, of class TestingObject.
     */
    @Test
    public void testGcd() throws Exception {
        assertEquals(TestingObject.gcd(1, 1), 1, "gcd(1, 1) == 1");
        assertEquals(TestingObject.gcd(1, 2), 1, "gcd(1, 2) == 1");
        assertEquals(TestingObject.gcd(2, 2), 2, "gcd(2, 2) == 2");
        assertEquals(TestingObject.gcd(4, 6), 2, "gcd(4, 6) == 2");
        assertEquals(TestingObject.gcd(6, 4), 2, "gcd(6, 4) == 2");
        assertEquals(TestingObject.gcd(-12345, 54321), 3, "gcd(-12345, 54321) == 3");
        assertEquals(TestingObject.gcd(54321, -12345), 3, "gcd(54321, -12345) == 3");
        assertEquals(TestingObject.gcd(99999, 33333), 33333, "gcd(99999, 33333) == 33333");
        assertEquals(TestingObject.gcd(18, 12), 6, "gcd(18, 12) == 6");
        
        try
        {
            TestingObject.gcd(0, 2);
            fail("No exception thrown for <gcd(0,2)>.");
        }
        catch(Exception e)
        {
            
        }
        try
        {
            TestingObject.gcd(2, 0);
            fail("No exception thrown for <gcd(2,0)>.");
        }
        catch(Exception e)
        {
            
        }
        try
        {
            TestingObject.gcd(0, 0);
            fail("No exception thrown for <gcd(0,0)>.");
        }
        catch(Exception e)
        {
            
        }
        
        
    }

    /**
     * Test of toSignedBinaryString method, of class TestingObject.
     */
    @Test
    public void testToSignedBinaryString() {
        assertEquals(TestingObject.toSignedBinaryString(0), "0", "Binary String of <0> is \"0\".");
        assertEquals(TestingObject.toSignedBinaryString(1), "01", "Binary String of <1> is \"01\".");
        assertEquals(TestingObject.toSignedBinaryString(-1), "11", "Binary String of <-1> is \"11\".");
        assertEquals(TestingObject.toSignedBinaryString(7), "0111", "Binary String of <7> is \"0111\".");
        assertEquals(TestingObject.toSignedBinaryString(-7), "1111", "Binary String of <-7> is \"1111\".");
        assertEquals(TestingObject.toSignedBinaryString(16), "010000", "Binary String of <0> is \"0\".");
        assertEquals(TestingObject.toSignedBinaryString(-16), "110000", "Binary String of <-16> is \"110000\".");
        
        
    }
    
}

