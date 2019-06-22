package com.techlab.guitar.eums;

public enum Builder {
	MARTIN,TYLOR,GIBSON,GUILD,SEAGULL,YAMAHA,FENDER;
	@Override
	public String toString() {
		switch (this) {
		case MARTIN:
			return "Martin";
		case TYLOR:
			return "Tylor";
		case GIBSON:
			return "Gibson";
		case GUILD:
			return "Guild";
		case SEAGULL:
			return "Seagul";
		case YAMAHA:
			return "Yamaha";
		case FENDER:
			return "Fender";
		}
		return null;
	}
}
