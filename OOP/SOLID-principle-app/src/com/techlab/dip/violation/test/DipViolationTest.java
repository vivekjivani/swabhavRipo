package com.techlab.dip.violation.test;

import com.techlab.dip.violation.LogType;
import com.techlab.dip.violation.TaxCalculator;

public class DipViolationTest {
	public static void main(String args[]) {
		TaxCalculator calculator = new TaxCalculator(LogType.FILE);
		int r = calculator.CalculateTax(0, 0);
		System.out.println(r);
	}
}
