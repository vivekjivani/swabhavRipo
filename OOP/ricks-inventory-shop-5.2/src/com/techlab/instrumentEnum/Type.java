package com.techlab.instrumentEnum;

public enum Type {
	ACOUSTIC,
	ELECTRIC,
	TWELVE_STRING,
	ARCHTOP,
	STEEL,
	RESONATOR;
	
	@Override
	public String toString() {
		switch (this) {
		case ACOUSTIC:
			return "Acoustic";
		case ELECTRIC:
			return "Electric";
		case TWELVE_STRING:
			return "TwelveString";
		case ARCHTOP:
			return "Archtop";
		case STEEL:
			return "Steel";
		case RESONATOR:
			return "Resonator";
		}
		return null;
	}
}
