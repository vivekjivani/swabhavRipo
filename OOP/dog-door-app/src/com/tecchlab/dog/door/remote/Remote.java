package com.tecchlab.dog.door.remote;

import com.techlab.dog.door.DogDoor;

public class Remote {
	private DogDoor door;
	
	public Remote(DogDoor door) {
		this.door=door;
	}
	public void pressButton() {
		System.out.println("Pressing the remote control button");
		if(door.isOpen())
			door.close();
		else
			door.open();
	}
}
