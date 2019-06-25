package com.techlab.isp.solution;

public class Manager implements IEatableWorkable{

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
