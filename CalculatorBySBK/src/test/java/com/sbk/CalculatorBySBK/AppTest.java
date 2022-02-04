package com.sbk.CalculatorBySBK;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	Calculator calculator = new Calculator();
    @Test
    public void addition() {
    	String exp = "2+2+2+3";
    	Integer expectedResult = 9;
    	assertEquals(calculator.addition(exp), expectedResult);
    }
    
    @Test
    public void subtraction() {
    	String exp = "7-2-2-3";
    	Integer expectedResult = 0;
    	assertEquals(calculator.subtraction(exp), expectedResult);
    }
    @Test
    public void multiplication() {
    	String exp = "2*2";
    	Integer expectedResult = 4;
    	assertEquals(calculator.multiplication(exp), expectedResult);
    }
    @Test
    public void division() {
    	String exp = "6/2";
    	Integer expectedResult = 3;
    	assertEquals(calculator.division(exp), expectedResult);
    }
    @Test
    public void modulo() {
    	String exp = "7%2";
    	Integer expectedResult = 1;
    	assertEquals(calculator.modulu(exp), expectedResult);
    	assertEquals(1.5,1.5,0);
    }
    
}
