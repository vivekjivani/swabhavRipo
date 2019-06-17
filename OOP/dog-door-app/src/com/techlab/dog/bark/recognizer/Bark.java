package com.techlab.dog.bark.recognizer;

public class Bark {
	String sound;

	public Bark(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public boolean equals(Object bark) {
		if (bark instanceof Bark) {
			Bark anotherBark = (Bark) bark;
			if (this.sound.equalsIgnoreCase(anotherBark.sound)) {
				return true;
			}
		}
		return false;
	}
}
