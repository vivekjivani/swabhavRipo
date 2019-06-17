package com.techlab.manager;

import com.techlab.employee.Employee;

public class Manager extends Employee {
	private static float HRA = 0.5f;
	private static float TA = 0.4f;
	private static float DA = 0.3f;
	private double houseRentAllowance;
	private double dearnessAllowance;
	private double travellingAllowance;

	public Manager(String name, long number, double basicSalary) {
		super(name, number, basicSalary);
	}

	public double getDearnessAllowance() {
		return dearnessAllowance;
	}

	public double getTravellingAllowance() {
		return travellingAllowance;
	}

	public double getHouseRentAllowance() {
		return houseRentAllowance;
	}

	@Override
	public void calculateNetSalary() {
		this.dearnessAllowance = this.getBasicSalary() * DA;
		this.houseRentAllowance = this.getBasicSalary() * HRA;
		this.travellingAllowance = this.getBasicSalary() * TA;
		this.setNetSalary(this.getBasicSalary() + this.getDearnessAllowance() + this.getHouseRentAllowance()
				+ this.getTravellingAllowance());
	}
}
