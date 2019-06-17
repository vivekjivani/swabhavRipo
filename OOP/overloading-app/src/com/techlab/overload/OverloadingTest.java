package com.techlab.overload;

public class OverloadingTest {

	public static void main(String args[]) {
		/*
		 * char x='a'; System.out.println(x);
		 * 
		 * char[] y= {'v','i','v','e','k'}; System.out.println(y);
		 * 
		 * boolean z=true; System.out.println(z);
		 * 
		 * Object obj=new Object(); System.out.println(obj);
		 * 
		 * double p=12.8978; System.out.println(p);
		 * 
		 * int q=10; System.out.println(q);
		 */

		int a = 10;
		OverloadingTest.printInfo(a);

		char b = 'q';
		OverloadingTest.printInfo(b);
		
		float c= 1.20f;
		OverloadingTest.printInfo(c);
		OverloadingTest.printInfo(c);

	}

	private static void printInfo(int x) {
		System.out.println(x);
	}

	private static void printInfo(boolean x) {
		System.out.println(x);
	}

	private static void printInfo(char[] x) {
		System.out.println(x);
	}

	private static void printInfo(float x) {
		System.out.println(x);
	}

	private static void printInfo(double x) {
		System.out.println(x);
	}
}