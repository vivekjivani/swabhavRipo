package com.techlab.employee;

public abstract class Employee {
	private String name;
	private long number;
	private double basicSalary;
	private double netSalary;

	public Employee(String name, long number, double basicSalary) {
		this.name = name;
		this.number = number;
		this.basicSalary = basicSalary;
	}

	public abstract void calculateNetSalary();

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public String getName() {
		return name;
	}

	public long getNumber() {
		return number;
	}

	public double getBasicSalary() {
		return basicSalary;
	}
}
