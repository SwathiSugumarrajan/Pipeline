package com.flexon.devopsTraining;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testSum() {
		
        System.out.println("sum");
        Integer x = 10;
        Integer y = 10;
        Integer expResult = 20;
        Integer result = Calculator.addCalc(x, y);
        assertEquals(expResult, result);
        assertEquals(null, Calculator.addCalc(15, null));
        assertEquals(null, Calculator.addCalc(null, 15));
        assertEquals(null, Calculator.addCalc(null, null));
    }
	@Test
	public void testDiff() {
		
        System.out.println("Difference");
        Integer x = 55;
        Integer y = 15;
        Integer expResult = 40;
        Integer result = Calculator.subCalc(x, y);
        assertEquals(expResult, result);
        assertEquals(null, Calculator.subCalc(15, null));
        assertEquals(null, Calculator.subCalc(null, 15));
        assertEquals(null, Calculator.subCalc(null, null));
    }
}

