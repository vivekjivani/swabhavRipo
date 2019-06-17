package com.techlab.file.operation.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.techlab.file.operation.FileOperationExample;

public class FileOperationTest {

	public static void main(String[] args) throws IOException {
		FileOperationExample file1 = new FileOperationExample();

		file1.setFilename("E:\\file7.txt");

		try {
			file1.readFile();
			file1.addContentToFile("It's appended text");
			file1.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Exist");
		}

	}

}
