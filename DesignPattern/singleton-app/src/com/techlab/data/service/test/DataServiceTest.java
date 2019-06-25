package com.techlab.data.service.test;

import com.techlab.data.service.DataService;

public class DataServiceTest {
	public static void main(String args[]) {
		DataService service1 = DataService.getInstance();
		service1.doSomething();
		
		DataService service2 = DataService.getInstance();
		service2.doSomething();
	}
}
