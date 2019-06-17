package com.techlab.salary.slip;

import com.techlab.developer.Developer;
import com.techlab.employee.Employee;
import com.techlab.manager.Manager;
import com.techlab.tester.Tester;

public class ConsoleSalarySlip {
	public void printSlip(Manager manager) {
		printBasicInfo(manager);
		System.out.println("HRA : " + manager.getHouseRentAllowance());
		System.out.println("TA : " + manager.getTravellingAllowance());
		System.out.println("DA : " + manager.getDearnessAllowance());
		System.out.println("Net Salary : " + manager.getNetSalary());
		System.out.println("----------------------------------------");
	}

	public void printSlip(Developer developer) {
		printBasicInfo(developer);
		System.out.println("PF : " + developer.getProvidentFund());
		System.out.println("Bonus : " + developer.getBouns());
		System.out.println("Net Salary : " + developer.getNetSalary());
		System.out.println("----------------------------------------");
	}

	public void printSlip(Tester tester) {
		printBasicInfo(tester);
		System.out.println("Perk : " + tester.getPerks());
		System.out.println("Net Salary : " + tester.getNetSalary());
		System.out.println("----------------------------------------");
	}

	private static void printBasicInfo(Employee employee) {
		System.out.println("----------------------------------------");
		System.out.println("Name : " + employee.getName());
		System.out.println("Basic Salary : " + employee.getBasicSalary());
	}
}