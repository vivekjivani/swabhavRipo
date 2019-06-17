package com.techlab.salaryslip.html.writer;

import java.io.FileWriter;
import java.io.IOException;

import com.techlab.developer.Developer;
import com.techlab.manager.Manager;
import com.techlab.tester.Tester;

public class HtmlSalarySlip {
	private String filename;
	private static String HTML_HEAD = "<html><head><title>SalarySlip</title></head><body><table border='1'>";
	private static String HTML_FOOTER = "</table></body></html>";

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filenameString) {
		this.filename = filenameString;
	}

	public void writeManagerToHtml(Manager manager) throws IOException {
		FileWriter writer = getFileWriter(this.filename);
		String data = HTML_HEAD + "<tr><td>Name</td><td>" + manager.getName() + "</td></tr><tr><td>Number</td><td>"
				+ manager.getNumber() + "</td></tr><tr><td>Basic Salary</td><td>" + manager.getBasicSalary()
				+ "</td></tr><tr><td>HRA</td><td>" + manager.getHouseRentAllowance() + "</td></tr><tr><td>TD</td><td>"
				+ manager.getTravellingAllowance() + "</td></tr><tr><td>DA</td><td>" + manager.getDearnessAllowance()
				+ HTML_FOOTER;
		writer.write(data);
		writer.close();

	}

	public void writeDeveloperToHtml(Developer developer) throws IOException {
		FileWriter writer = getFileWriter(this.filename);
		String data = HTML_HEAD + "<tr><td>Name</td><td>" + developer.getName() + "</td></tr><tr><td>Number</td><td>"
				+ developer.getNumber() + "</td></tr><tr><td>Basic Salary</td><td>" + developer.getBasicSalary()
				+ "</td></tr><tr><td>ProvidentFund</td><td>" + developer.getProvidentFund()
				+ "</td></tr><tr><td>Bonus</td><td>" + developer.getBouns() + "</td></tr><tr><td>Net Salary</td><td>"
				+ developer.getNetSalary() + HTML_FOOTER;
		writer.write(data);
		writer.close();

	}

	public void writeTesterToHtml(Tester tester) throws IOException {
		FileWriter writer = getFileWriter(this.filename);
		String data = HTML_HEAD + "<tr><td>Name</td><td>" + tester.getName() + "</td></tr><tr><td>Number</td><td>"
				+ tester.getNumber() + "</td></tr><tr><td>Basic Salary</td><td>" + tester.getBasicSalary()
				+ "</td></tr><tr><td>Perks</td><td>" + tester.getPerks() + "</td></tr><tr><td>Net Salary</td><td>"
				+ tester.getNetSalary() + HTML_FOOTER;
		writer.write(data);
		writer.close();
	}

	private static FileWriter getFileWriter(String filename) throws IOException {
		FileWriter writer = new FileWriter(filename);
		return writer;
	}
}
