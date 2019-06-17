package com.techlab.properties.test;

import java.io.IOException;

import com.techlab.properties.PropertiesClass;

public class PropertiesClassTest {
	public static void main(String args[]) {
		PropertiesClass property = new PropertiesClass();
		property.setFileName("config.properties");
		property.setFilePath("F:\\swabhav_repository\\OOP\\property-class-app\\bin");
		try {
			property.setProperty("name", "vivek");
			property.setProperty("age", "18");
			property.setProperty("height", "5.11");
			property.getProperty("name");
			property.updateProperty("name", "darshan");
			property.getProperty("name");
			property.displayAllProperties();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}

	}
}
