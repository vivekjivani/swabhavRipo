package com.tecchlab.file.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import com.techlab.loaderInterface.Loader;

public class DiskLoader implements Loader {
	private HashSet<String> loadedData = new HashSet<String>();
	private String fileLocation;

	public DiskLoader(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public HashSet<String> load() {
		File file = new File(fileLocation);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				loadedData.add(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return loadedData;
	}
}
