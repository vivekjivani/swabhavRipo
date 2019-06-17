package com.techlab.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesClass {
	private InputStream inputStream;
	private OutputStream outputStream;
	private String fileName;
	private String filePath;
	private Properties properties;

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setProperty(String key, String value) throws IOException {
		outputStream = new FileOutputStream(this.filePath + "\\" + this.fileName);
		properties = new Properties();
		properties.setProperty(key, value);
		properties.store(outputStream, null);
		outputStream.close();
	}

	public void getProperty(String key) throws IOException {
		inputStream = new FileInputStream(this.filePath + "\\" + this.fileName);
		properties = new Properties();
		properties.load(inputStream);
		System.out.println(key + " : " + properties.getProperty(key));
	}

	public void updateProperty(String key, String value) throws IOException {
		outputStream = new FileOutputStream(this.filePath + "\\" + this.fileName,true);
		properties.setProperty(key, value);
		properties.setProperty(key, value);
		properties.store(outputStream, null);
		outputStream.close();
	}

	public void displayAllProperties() {
		properties.list(System.out);
	}

}
