package com.techlab.file.loader.test;

import java.net.MalformedURLException;

import com.tecchlab.file.loader.DiskLoader;
import com.tecchlab.file.loader.UrlLoader;
import com.techlab.file.analyzer.Analyzer;
import com.techlab.file.parser.FileDataParser;

public class AnalyzerTest {
	public static void main(String args[]) throws MalformedURLException {
		//Analyzer analyzer = new Analyzer(new FileDataParser(new UrlLoader("https://swabhav-tech.firebaseapp.com/emp.txt")));
		Analyzer analyzer = new Analyzer(new FileDataParser(new DiskLoader("E:\\OOP\\dataFile.txt")));
		System.out.println("Highest Salaried Employee is : \n" + analyzer.getMaximumSalariedEmployee());
		System.out.println("\nNumber Of Employee Based On Department : \n" + analyzer.getNumberOFEmployeeBasedOnDepartment());
		System.out.println("\nNumber Of Employee Based On Designation : \n" + analyzer.getNumberOfEmployeeBasedOnDesignation());
	}
}
