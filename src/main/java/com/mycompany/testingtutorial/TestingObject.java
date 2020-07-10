package com.mycompany.testingtutorial;

/**
 *This class is used to experiment with the testing tools in NetBeans.
 * 
 * @author Peter Crusinberry
 */
public class TestingObject {
    
    public static int factorial(int number) throws Exception
    {
       if (number < 0)
       {
           throw new Exception("Factorial can only be computed for non-negitive numbers!\n");
       }
       else if (number == 0)
       {
           return 1;
       }
       else 
       {
           return number * factorial(number - 1);
       }
    }
    
    public static int gcd(int a, int b) throws Exception
    {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
        {
            throw new Exception("Values must be non-zero!");
        }
        if (a == b)
        {
            return a;
        }
        if (a < b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        return gcd(a - b, b);
    }
    
    public static String toSignedBinaryString(int a)
    {
        String sign = "";
        String bin = "";
        if (a < 0)
        {
            sign = "1";
            a = a * -1;
        }
        else
        {
            sign = "0";
        }
        
        while (a != 0)
        {
            bin = (a % 2) + bin;
            a = a >> 1;
        }
        
        return sign + bin;
    }
}

