package com.techlab.child.threadClass;

import java.util.Date;

public class ChildThreadClass implements Runnable{

	@Override
	public void run() {
		Date date = new Date();	
		for(;;) {
			System.out.println(date);
		}
	}
	
}
