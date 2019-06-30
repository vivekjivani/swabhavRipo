package com.techlabs.game;

public class Player {
	private String name;
	private Marker mark;
	
	public Player(String name, Marker mark) {
		this.name = name;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public Marker getMark() {
		return mark;
	}	
}
