package com.techlab.human.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlab.human.Human;

public class HumanSerialization {
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void serializeHuman(Human humanObject) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(humanObject);
			out.close();
			file.close();
			System.out.println("Object serialization success");
		} catch (IOException ex) {
			System.out.println("IOException");
		}
	}

	public void deserializeHuman() {
		Human vivek = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			vivek = (Human) in.readObject();
			in.close();
			file.close();
			System.out.println("Object deserialization success");
			System.out.println("Human name = " + vivek.getName());
		}

		catch (IOException ex) {
			System.out.println("IOException");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
