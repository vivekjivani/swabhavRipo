package com.techlab.dip.solution.test;

import com.techlab.dip.solution.FileLogger;
import com.techlab.dip.solution.TaxCalculator;

public class DipSolutionTest {
	public static void main(String args[]) {
		TaxCalculator calculator = new TaxCalculator(new FileLogger());
		int r = calculator.CalculateTax(0, 0);
		System.out.println(r);
	}
}
