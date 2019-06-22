package com.techlab.calculate;

import com.techlab.Calculator.exceptions.NegativeValueException;

public class Calculator {
	public int add(int a, int b) throws NegativeValueException {
		if (a < 0 || b < 0)
			throw new NegativeValueException();
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}
}
