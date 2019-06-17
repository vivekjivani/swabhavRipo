package com.techlab.dog.bark.recognizer;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlab.dog.door.DogDoor;

public class BarkRecognizer {
	private DogDoor door=new DogDoor();
	public BarkRecognizer(DogDoor door) {
		this.door = door;
		
	}
	public void recognize(Bark bark) {
		System.out.println("BarkRecognizer: Heard a `"+bark.getSound()+"`");
		ArrayList<Bark> allowedBarks=door.getAllowedBark();
		for(Iterator<Bark> i =allowedBarks.iterator();i.hasNext();) {
			Bark allowedBark=(Bark)i.next();
			if(allowedBark.equals(bark)) {
				door.open();
				return ;
			}
		}
		System.out.println("This dog is not allowed..");
	}
}
