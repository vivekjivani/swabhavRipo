package com.techlab.dip.solution;

public class FileLogger implements ILoggable {

	@Override
	public void log(String message) {
		System.out.println("File Logger : "+message);
	}
}
