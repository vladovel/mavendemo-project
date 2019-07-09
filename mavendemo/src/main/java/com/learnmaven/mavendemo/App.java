package com.learnmaven.mavendemo;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{

	final static Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {

    	Calculator calc = new Calculator();
    	
    	logger.debug(calc.add(1, 2));
    	logger.debug(calc.sub(4, 2));
    	logger.debug(calc.mul(3, 5));
    	logger.debug(calc.div(20, 5));
    	//System.out.println(new Calculator().add(1, 5));
    
    }
}
