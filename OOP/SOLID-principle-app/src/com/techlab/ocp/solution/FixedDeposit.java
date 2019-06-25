package com.techlab.ocp.solution;

public class FixedDeposit {
	private String accountNumber;
	private String name;
	private double principal;
	private float period;
	private double rate;

	public FixedDeposit(String accountNumber, String name, double principal, float period, Festival festival) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.period = period;
		this.rate = festival.getInterestRate();
	}

	public double calculateSimpleInterest() {
		return principal * (1 + period * rate);
	}
}
