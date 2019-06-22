package com.techlab.singletone.pattern;

public class MySingletone {
	
	private static MySingletone instance=null;
	private MySingletone() {	}
	public static MySingletone getInstance() {
		if(instance == null)
			instance = new MySingletone();
		return instance;
	}
	public void display() {
		System.out.println("Hello Singletone");
	}
}
