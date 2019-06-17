package com.techlab.test.exception.propagation;

public class TestExceptionPropagation {
	public static void main(String args[]) throws Exception {
		try{
			m1();
		}catch(Exception e) {
			System.out.println("Error catch");
		}
		System.out.println("End of main..");
	}
	private static void m1() throws Exception{
		System.out.println("inside m1");
		m2();
	}
	private static void m2() throws Exception{
		System.out.println("inside m2");
		m3();
	}
	private static void m3() throws Exception {
		System.out.println("inside m3");
		throw new Exception("Error in m3");
	}
}
