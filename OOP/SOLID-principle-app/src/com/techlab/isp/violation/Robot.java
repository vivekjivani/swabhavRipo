package com.techlab.isp.violation;

public class Robot implements Iworker{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void startWork() {
		System.out.println("Robot Start Working...");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stop Working...");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot can't eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robot can't eat");
	}
	
}
