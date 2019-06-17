package com.headFirstJava.ch16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class SongTest {
	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		new SongTest().go();
	}

	public void go() {
		getSong();
		for (Song s : songList) {
			System.out.print(s.artist + ", ");
		}
		System.out.println("\n");
		Collections.sort(songList);
		for (Song s : songList) {
			System.out.print(s.artist + ", ");
		}
	}

	void getSong() {
		try {
			File file = new File("E:\\SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	void addSong(String lineToParse) {
		String token[] = lineToParse.split("/");
		Song nextSong = new Song(token[0],token[1]);
		songList.add(nextSong);
	}

}
