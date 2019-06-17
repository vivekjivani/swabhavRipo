package com.techlab.enumexample;

public class EnumTest {
	enum Status{
		RUNNING(0),STOP(1);
		
		private Status(int stateCode) {
			this.stateCode=stateCode;
		}
		private int stateCode;
		
	}
	public static void main(String args[]) {
		
		for(Status s : Status.values())
			System.out.println(s+" "+s.stateCode);
	}
}
