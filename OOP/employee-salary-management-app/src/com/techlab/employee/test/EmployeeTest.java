package com.techlab.employee.test;

import java.io.IOException;

import com.techlab.developer.Developer;
import com.techlab.manager.Manager;
import com.techlab.salary.slip.ConsoleSalarySlip;
import com.techlab.salaryslip.html.writer.HtmlSalarySlip;
import com.techlab.tester.Tester;

public class EmployeeTest {
	public static void main(String args[]) {
		Manager vivekManager = new Manager("vivek", 1001, 30000);
		Manager parasManager = new Manager("paras", 1001, 30000);
		Developer darshanDeveloper = new Developer("darshan", 2001, 25000);
		Developer karanDeveloper = new Developer("karan", 2002, 20000);
		Tester hirenTester = new Tester("hiren", 9008, 40000);

		HtmlSalarySlip htmlWriterManager = new HtmlSalarySlip();
		HtmlSalarySlip htmlWriterDeveloper = new HtmlSalarySlip();
		HtmlSalarySlip htmlWriterTester = new HtmlSalarySlip();

		vivekManager.calculateNetSalary();
		parasManager.calculateNetSalary();
		darshanDeveloper.calculateNetSalary();
		karanDeveloper.calculateNetSalary();
		hirenTester.calculateNetSalary();

		ConsoleSalarySlip slip = new ConsoleSalarySlip();
		slip.printSlip(vivekManager);
		slip.printSlip(parasManager);
		slip.printSlip(darshanDeveloper);
		slip.printSlip(karanDeveloper);
		slip.printSlip(hirenTester);

		try {
			htmlWriterManager.setFilename("res\\manager\\" + vivekManager.getName() + "SalarySlip.html");
			htmlWriterManager.writeManagerToHtml(vivekManager);
			htmlWriterDeveloper.setFilename("res\\developer\\" + darshanDeveloper.getName() + "SalarySlip.html");
			htmlWriterDeveloper.writeDeveloperToHtml(darshanDeveloper);
			htmlWriterTester.setFilename("res\\tester\\" + hirenTester.getName() + "SalarySlip.html");
			htmlWriterTester.writeTesterToHtml(hirenTester);
			htmlWriterManager.setFilename("res\\manager\\" + parasManager.getName() + "SalarySlip.html");
			htmlWriterManager.writeManagerToHtml(parasManager);
			htmlWriterDeveloper.setFilename("res\\developer\\" + karanDeveloper.getName() + "SalarySlip.html");
			htmlWriterDeveloper.writeDeveloperToHtml(karanDeveloper);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
