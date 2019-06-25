package com.techlab.isp.violation;

import com.techlab.isp.solution.IEatableWorkable;

public class Manager implements Iworker{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void startWork() {
		System.out.println("Manager Start Working...");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager Stop Working...");
	}

	@Override
	public void startEat() {
		System.out.println("Manager Start Eating...");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager stop Eating...");
	}
	
}
