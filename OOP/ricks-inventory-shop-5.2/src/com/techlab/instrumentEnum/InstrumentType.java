package com.techlab.instrumentEnum;

public enum InstrumentType {
	GUITAR, MANDOLIN, DOBRO, FIDDLE, BASS, BANJO;
	@Override
	public String toString() {
		switch(this) {
		case GUITAR:
			return "Guitar";
		case MANDOLIN:
			return "Mandolin";
		case DOBRO:
			return "Dobro";
		case FIDDLE:
			return "Fiddle";
		case BASS:
			return "Bass";
		case BANJO:
			return "Banjo";
		default:
			return "Unspecified";
		}
	}
}
