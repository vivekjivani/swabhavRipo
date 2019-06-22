package com.techlab.custom.annotation.test;

import java.util.ArrayList;

import com.techlab.cunstom.annotation.CustomAnnotation;

public class CustomAnnotationTest {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException {
		CustomAnnotation customAnnotation = new CustomAnnotation();
		ArrayList<String> methods = customAnnotation.GetAnotatedMethod();
		System.out.println("Number of Methods are : "+customAnnotation.getNumberOfRequiredRefectorMethod());
		System.out.println("Required Refector Methods are..");
		for(String methodName : methods)
			System.out.println(methodName);
	}
}
