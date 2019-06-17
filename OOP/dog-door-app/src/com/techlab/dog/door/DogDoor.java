package com.techlab.dog.door;

import java.util.ArrayList;

import com.techlab.dog.bark.recognizer.Bark;

public class DogDoor {
	private boolean open;
	private ArrayList<Bark> allowedBark=new ArrayList<Bark>();

	public DogDoor() {
		this.open = false;
	}

	public void addAllowedBark(Bark bark) {
		allowedBark.add(bark);
	}
	
	public ArrayList<Bark> getAllowedBark() {
		return allowedBark;
	}
	
	public void open() {
		System.out.println("The Dog Door is Open");
		open = true;
	}

	public void close() {
		System.out.println("The Dog Door is Close");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}
}
