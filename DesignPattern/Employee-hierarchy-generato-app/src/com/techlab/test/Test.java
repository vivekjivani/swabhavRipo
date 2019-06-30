package com.techlab.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.tecchlab.file.loader.DiskLoader;
import com.techlab.employee.Employee;
import com.techlab.file.parser.FileDataParser;

public class Test {
	public static void main(String args[]) {
		FileDataParser parser = new FileDataParser(new DiskLoader("E:\\OOP\\dataFile.txt"));
		Employee employee = new Employee();
		HashSet<Employee> employeeList = employee.getEmployeeList();

		for (Iterator iterator = employeeList.iterator(); iterator.hasNext();) {
			Employee e = (Employee) iterator.next();
			//System.out.println(e.getId() + " " + e.getName() + " " + e.getManagerId() + " " + e.getDesignation());
			e.addRepotees();
		}
		System.out.println("**********************************************");

		for (Iterator iterator = employeeList.iterator(); iterator.hasNext();) {
			Employee e = (Employee) iterator.next();
			if(e.getName().equals("KING")) {
				e.displayRepoteeHierarchy();
			}
		}
	}
}
