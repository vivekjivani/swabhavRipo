package com.techlab.developer;

import com.techlab.employee.Employee;

public class Developer extends Employee {
	private static float PF = 0.4f;
	private static float BONUS = 0.3f;
	private double providentFund;
	private double bouns;

	public Developer(String name, long number, double basicSalary) {
		super(name, number, basicSalary);
	}

	public double getProvidentFund() {
		return providentFund;
	}

	public double getBouns() {
		return bouns;
	}

	@Override
	public void calculateNetSalary() {
		this.providentFund = this.getBasicSalary() * PF;
		this.bouns = this.getBasicSalary() * BONUS;
		this.setNetSalary(this.getBasicSalary() + this.getBouns() - this.getProvidentFund());
	}
}
