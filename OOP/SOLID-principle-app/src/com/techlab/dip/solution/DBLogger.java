package com.techlab.dip.solution;

public class DBLogger implements ILoggable{

	@Override
	public void log(String message) {
		System.out.println("DBLogger : "+message);		
	}

}
