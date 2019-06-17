package com.techlab.dog.door.test;

import com.tecchlab.dog.door.remote.Remote;
import com.techlab.dog.bark.recognizer.BarkRecognizer;
import com.techlab.dog.door.DogDoor;

public class DogDoorTest {
	public static void main(String args[]) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		
		System.out.println("Fido Barks To Get Out...");
		//remote.pressButton();
		recognizer.recognize("woof!!");
		
		System.out.println("Fido Has Gone Out...");
		//remote.pressButton();
		System.out.println("Fido's all done..");
		//remote.pressButton();
		try {
			Thread.currentThread();
			Thread.sleep(10000);
		}catch (InterruptedException e) {		}
		System.out.println("But he's stuck outside..");
		System.out.println("Fido start barking..");
		recognizer.recognize("Woof!!");
		//System.out.println("Gina press the button on remote..");
		//remote.pressButton();
		System.out.println("Fido's Back inside..");
	}
}
