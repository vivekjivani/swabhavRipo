package com.techlab.dip.solution;

public class TaxCalculator {
	private ILoggable log;
	
	public TaxCalculator(ILoggable log) {
		this.log = log;
	}
	
	public int CalculateTax(int amount, int rate) {
		int r=0;
		try {
			r = amount / rate;
		} catch (Exception ex) {
				log.log(ex.getMessage());
		}
		return r;
	}
}
