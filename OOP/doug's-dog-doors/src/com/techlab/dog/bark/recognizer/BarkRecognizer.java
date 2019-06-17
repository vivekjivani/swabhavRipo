package com.techlab.dog.bark.recognizer;

import java.util.Timer;
import java.util.TimerTask;

import com.techlab.dog.door.DogDoor;

public class BarkRecognizer {
	private DogDoor door=new DogDoor();
	public BarkRecognizer(DogDoor door) {
		this.door = door;
		
	}
	public void recognize(String bark) {
		System.out.println("BarkRecognizer: Heard a `"+bark+"`");
		door.open();

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				door.close();
				timer.cancel();
			}
		},5000);
	}
}
