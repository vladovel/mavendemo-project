package com.learnmaven.mavendemo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testAdd()
    {
        assertEquals(10, new Calculator().add(5, 5));
    }
    
    public void testSub()
    {
        assertEquals(2, new Calculator().sub(5, 3));
    }
    
    public void testMul()
    {
        assertEquals(15, new Calculator().mul(5, 3));
    }
    
    public void testDiv()
    {
        assertEquals(20.0, new Calculator().div(100, 5));
    }
        
   
}
