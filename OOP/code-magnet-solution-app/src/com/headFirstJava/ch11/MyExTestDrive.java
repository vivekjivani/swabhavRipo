package com.headFirstJava.ch11;

class MyEx extends Exception {}

public class MyExTestDrive{
	public static void main(String args[]) {
		String test=args[0];
		System.out.print("t");
		System.out.print("h");
		try{
			doRiskey(test);
		}catch(MyEx e) {
			System.out.print("a");
		}
		finally {
			System.out.print("w");
			System.out.print("s");
		}
	}
	static void doRiskey(String t) throws MyEx{
		if("yes".equals(t)) {
			throw new MyEx();
		}
		System.out.print("r");
		System.out.print("o");
	}
}
