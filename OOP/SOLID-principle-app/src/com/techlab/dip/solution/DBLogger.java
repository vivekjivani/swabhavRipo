package com.techlab.dip.solution;

public class DBLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("DBLogger : "+message);		
	}

}
