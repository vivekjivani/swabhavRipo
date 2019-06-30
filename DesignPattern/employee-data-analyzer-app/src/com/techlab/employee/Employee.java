package com.techlab.employee;

import java.util.HashSet;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private int managerId;
	private String datOfJoining;
	private double salary;
	private double commision;
	private int department;
	private static HashSet<Employee> employeeList = new HashSet<Employee>();;
	
	public Employee() {
	}

	public Employee(int id, String namea, String designation, int managerId, String datOfJoining, double salary,
			double commision, int department) {
		this.id = id;
		this.name = namea;
		this.designation = designation;
		this.managerId = managerId;
		this.datOfJoining = datOfJoining;
		this.salary = salary;
		this.commision = commision;
		this.department = department;
		employeeList.add(this);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public int getManagerId() {
		return managerId;
	}

	public String getDatOfJoining() {
		return datOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public double getCommision() {
		return commision;
	}

	public int getDepartment() {
		return department;
	}

	public HashSet<Employee> getEmployeeList() {
		return employeeList;
	}
	
	
}
