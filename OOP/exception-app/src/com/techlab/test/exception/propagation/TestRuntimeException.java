package com.techlab.test.exception.propagation;

public class TestRuntimeException {
	public static void main(String args[]){
		//try{
			m1();
		//}catch (Exception e) {
			//System.out.println(e.getMessage());
		//}	
		System.out.println("End of main..");
	}
	private static void m1(){
		System.out.println("inside m1");
		m2();
	}
	private static void m2(){
		System.out.println("inside m2");
		m3();
	}
	private static void m3(){
		System.out.println("inside m3");
		throw new RuntimeException("Error in m3");
	}
}
