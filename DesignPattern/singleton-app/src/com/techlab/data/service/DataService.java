package com.techlab.data.service;

public class DataService {
	private static DataService container;

	private DataService() {
		System.out.println("Service created");
	}

	public static DataService getInstance() {
		if (container == null) {
			container = new DataService();
		}
		return container;
	}

	public void doSomething() {
		System.out.println("Hash Code : "+this.hashCode());
	}
}
