package com.techlab.file.parser;

import java.util.HashSet;
import java.util.Iterator;

import com.techlab.employee.Employee;
import com.techlab.loaderInterface.Loader;

public class FileDataParser {
	private HashSet<String> employeeDataSet;

	public FileDataParser(Loader loder) {
		employeeDataSet = new HashSet<String>();
		employeeDataSet = loder.load();
		parseData();
	}

	private void parseData() {
		for (Iterator<String> i = employeeDataSet.iterator(); i.hasNext();) {
			String[] splitedData = splitEmployeeData((String) i.next());
			
			splitedData[1] = splitedData[1].replaceAll("\'", "");
			splitedData[2] = splitedData[2].replaceAll("\'", "");

			if (splitedData[3].equalsIgnoreCase("NULL")) {
				splitedData[3] = "0";
			}
			if (splitedData[6].equalsIgnoreCase("NULL")) {
				splitedData[6] = "0";
			}
			new Employee(Integer.parseInt(splitedData[0]), splitedData[1], splitedData[2],
					Integer.parseInt(splitedData[3]), splitedData[4], Double.parseDouble(splitedData[5]),
					Double.parseDouble(splitedData[6]), Integer.parseInt(splitedData[7]));
		}
	}

	private String[] splitEmployeeData(String employeeData) {
		return employeeData.split(",");
	}
}
