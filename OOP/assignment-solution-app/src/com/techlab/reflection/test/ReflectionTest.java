package com.techlab.reflection.test;

import com.techlab.reflection.*;

public class ReflectionTest {

	public static void main(String[] args) {
		Reflection reflect = new Reflection();
		reflect.setClassName("java.lang.Object");
		try {
			reflect.findConstructors();
			reflect.findFields();
			reflect.findMethods();
			System.out.println("Class Name : " + reflect.getClassName());
			System.out.println("Number of public Fields : " + reflect.getNumbersOfField());
			System.out.println("Number of public Methods : " + reflect.getNumberOfMethods());
			System.out.println("Number of public Constructor : " + reflect.getNumbersOfConstructor());
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}

	}

}
