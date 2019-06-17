package com.techlab.dog.door;

public class DogDoor {
	private boolean open;
	
	public DogDoor() {
		this.open=false;
	}
	public void open() {
		System.out.println("The Dog Door is Open");
		open=true;
	}
	public void close() {
		System.out.println("The Dog Door is Close");
		open=false;
	}
	public boolean isOpen() {
		return open;
	}
}
