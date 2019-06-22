package com.techlab.junit.test.cases;

import com.techlab.calculate.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSubtract {
	@Test
	void testSub() {
		assertEquals(5, new Calculator().subtract(15, 10));
	}
}
