package com.techlab.calculate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techlab.Calculator.exceptions.NegativeValueException;

public class CalculatorTest {

	@Test(expected = com.techlab.Calculator.exceptions.NegativeValueException.class)
	public void testAdd_NegativeNumberGiven_ShouldThrowNegativeNumberException() throws NegativeValueException {
		new Calculator().add(-1, 5);
	}

	@Test
	public void testAdd_Add5Into4_ResultIs9() throws NegativeValueException {
		int actual = new Calculator().add(5, 4);
		int expected = 9;
		assertEquals(actual, expected);
	}

	@Test
	public void testSubtract_Subtract4Into5_ResultIs1() {
		int actual = new Calculator().subtract(5, 4);
		int expected = 1;
		assertEquals(actual, expected);
	}

}
