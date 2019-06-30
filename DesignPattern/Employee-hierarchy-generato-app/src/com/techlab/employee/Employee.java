package com.techlab.employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private int managerId;
	private String datOfJoining;
	private double salary;
	private double commision;
	private int department;
	private static String space = "";
	//private static String oldSpace="";
	private static HashSet<Employee> employeeList = new HashSet<Employee>();
	private ArrayList<Employee> reporteesList = new ArrayList<Employee>();

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

	public void addRepotees() {
		for (Iterator iterator = employeeList.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (this.id == employee.managerId) {
				this.reporteesList.add(employee);
			}
		}
	}

	public void displayRepoteeHierarchy() {
		System.out.println(space+this.id + " " + this.name + " " + this.managerId);
		if (!this.reporteesList.isEmpty()) {
			for (int i = 0; i<this.reporteesList.size(); i++) {
				Employee e = reporteesList.get(i);
				space +="\t";
				e.displayRepoteeHierarchy();
				if(space != "") {
				space = space.substring(0, space.length() - 1);}
			}
		}
		
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

	public ArrayList<Employee> getEmployeeReportees() {
		return reporteesList;
	}

}
