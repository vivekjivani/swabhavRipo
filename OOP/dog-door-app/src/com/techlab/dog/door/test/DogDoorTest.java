package com.techlab.dog.door.test;

import com.techlab.dog.bark.recognizer.Bark;
import com.techlab.dog.bark.recognizer.BarkRecognizer;
import com.techlab.dog.door.DogDoor;

public class DogDoorTest {
	public static void main(String args[]) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);

		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("roowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("woof"));

		System.out.println("Bruce start Barking...");
		recognizer.recognize(new Bark("rowlf"));
		System.out.println("Bruce has gone ouside..");

		try {
			Thread.currentThread();
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		
		System.out.println("Bruce's all done..");
		System.out.println("But he's stuck outside..");

		Bark smallDogBark = new Bark("yip");
		recognizer.recognize(smallDogBark);

		try {
			Thread.currentThread();
			Thread.sleep(10000);
		} catch (InterruptedException e) {}

		System.out.println("Bruce Start Barking...");
		recognizer.recognize(new Bark("Woof"));
		System.out.println("Bruce Back inside..");
	}
}
