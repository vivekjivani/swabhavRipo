package com.techlab.junit.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.Calculator.exceptions.NegativeValueException;
import com.techlab.calculate.Calculator;

class TestAdd {
	Calculator cal = new Calculator(); 
	
	@Test
	void testAdd() throws NegativeValueException {
		assertEquals(10, cal.add(5,5));
	}
	
	@Test(expected = NegativeValueException.class)
	void testNegativeValueException() throws NegativeValueException {
		cal.add(-5,5);
	}
}
