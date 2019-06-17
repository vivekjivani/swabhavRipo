package com.techlab.file.operation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperationExample {
	private String filename;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public void readFile() throws IOException, FileNotFoundException {
		if (!checkFileExist(this.filename))
			throw new FileNotFoundException();
		FileReader fileReader = getFileReader(this.filename);
		int ch;
		while ((ch = fileReader.read()) != -1)
			System.out.print((char) ch);
		fileReader.close();
	}

	public void addContentToFile(String content) throws IOException, FileNotFoundException {
		if (!checkFileExist(this.filename))
			throw new FileNotFoundException();
		BufferedWriter bufferedWriter = null;
		bufferedWriter = new BufferedWriter(new FileWriter(filename, true));
		bufferedWriter.write(content);
		bufferedWriter.close();
	}

	public void writeToFile(String content) throws IOException, FileNotFoundException {
		if (!checkFileExist(this.filename))
			throw new FileNotFoundException();
		BufferedWriter bufferedWriter = null;
		bufferedWriter = new BufferedWriter(new FileWriter(filename));
		bufferedWriter.write(content);
		bufferedWriter.close();
	}

	public static FileReader getFileReader(String filename) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(filename);
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}
		return fileReader;
	}

	public static boolean checkFileExist(String filename) {
		File file = new File(filename);
		return file.exists();
	}
}
