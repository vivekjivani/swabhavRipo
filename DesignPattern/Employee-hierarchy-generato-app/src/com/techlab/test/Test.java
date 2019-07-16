package com.techlab.test;

import java.util.HashSet;
import java.util.Iterator;

import com.tecchlab.file.loader.DiskLoader;
import com.techlab.employee.Employee;
import com.techlab.file.parser.FileDataParser;
import com.techlab.xmlgenerator.XmlGenerator;

public class Test {
	public static void main(String args[]) {
		FileDataParser parser = new FileDataParser(new DiskLoader("E:\\OOP\\dataFile.txt"));
		Employee employee = new Employee(new XmlGenerator());
		HashSet<Employee> employeeList = employee.getEmployeeList();

		for (Iterator<Employee> iterator = employeeList.iterator(); iterator.hasNext();) {
			Employee e = (Employee) iterator.next();
			e.addRepotees();
		}
		
		//System.out.println("**********************************************");

		for (Iterator<Employee> iterator = employeeList.iterator(); iterator.hasNext();) {
			Employee e = (Employee) iterator.next();
			if (e.getName().equals("KING")) {
				e.generateXml();
				System.out.println(e.getXml());
			}
		}
	}
}
