package com.headFirstJava.ch16;

public class Song implements Comparable<Song> {
	String title;
	String artist;
	String rating;
	String bpm;

	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return title.compareTo(o.getArtist());
	}

	Song(String t, String a) {
		this.title = t;
		this.artist = a;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setBpm(String bpm) {
		this.bpm = bpm;
	}

	public String getBpm() {
		return this.bpm;
	}

	public void setArtist(String artis) {
		this.artist = artis;
	}

	public String getArtist() {
		return this.artist;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
