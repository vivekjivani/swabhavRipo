package com.techlab.tester;

import com.techlab.employee.Employee;

public class Tester extends Employee {
	private static final float PERKS_INCREMENT_PERSENTAGE = 0.3f;
	private double perks;

	public Tester(String name, long number, double basicSalary) {
		super(name, number, basicSalary);
	}

	public double getPerks() {
		return perks;
	}

	@Override
	public void calculateNetSalary() {
		this.perks=this.getBasicSalary()*PERKS_INCREMENT_PERSENTAGE;
		this.setNetSalary(this.getBasicSalary()+this.getPerks());	
	}

}
