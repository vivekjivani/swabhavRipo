package com.techlab.file.analyzer;

import java.util.HashSet;

import com.techlab.employee.Employee;
import com.techlab.file.parser.FileDataParser;

public class Analyzer {
	private HashSet<Employee> setOfEmployee;
	private String MaximumSalariedEmployee;
	private double highestSalary;
	private static int MANAGER, PRESIDENT, ANALYST, CLERK, SALESMAN;
	private static int DEPT_10, DEPT_20, DEPT_30;

	public Analyzer(FileDataParser parser) {
		setOfEmployee = new HashSet<Employee>();
		setOfEmployee = new Employee().getEmployeeList();
	}

	public String getMaximumSalariedEmployee() {
		findMaximumSalariedEmployee();
		return MaximumSalariedEmployee + ", " + highestSalary;
	}

	public String getNumberOFEmployeeBasedOnDepartment() {
		findNumberOFEmployeeBasedOnDepartment();
		return "Department id 10 has : " + DEPT_10 + " Employee" + "\n" + "Department id 20 has : " + DEPT_20
				+ " Employee" + "\n" + "Department id 30 has : " + DEPT_30 + " Employee";
	}

	public String getNumberOfEmployeeBasedOnDesignation() {
		findNumberOfEmployeeBasedOnDesignation();
		return "President : " + PRESIDENT + "\nManager : " + MANAGER + "\nClerk : " + CLERK + "\nSalesman : " + SALESMAN
				+ "\nAnalyst : " + ANALYST;
	}

	private void findMaximumSalariedEmployee() {
		for (Employee e : setOfEmployee) {
			if (highestSalary < e.getSalary()) {
				highestSalary = e.getSalary();
				MaximumSalariedEmployee = e.getName();
			}
		}
	}

	private void findNumberOfEmployeeBasedOnDesignation() {
		for (Employee e : setOfEmployee) {
			if (e.getDesignation().equalsIgnoreCase("MANAGER"))
				MANAGER++;
			if (e.getDesignation().equalsIgnoreCase("PRESIDENT"))
				PRESIDENT++;
			if (e.getDesignation().equalsIgnoreCase("CLERK"))
				CLERK++;
			if (e.getDesignation().equalsIgnoreCase("SALESMAN"))
				SALESMAN++;
			if (e.getDesignation().equalsIgnoreCase("ANALYST"))
				ANALYST++;
		}
	}

	private void findNumberOFEmployeeBasedOnDepartment() {
		for (Employee e : setOfEmployee) {
			if (e.getDepartment() == 10)
				DEPT_10++;
			if (e.getDepartment() == 20)
				DEPT_20++;
			if (e.getDepartment() == 30)
				DEPT_30++;
		}
	}
}
