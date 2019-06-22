package com.techlab.guitar.eums;

public enum Wood {
	ALDER,BASSWOOD,MAHOGANY,WALNUT;
	
	@Override
	public String toString() {
		switch (this) {
		case ALDER:
			return "Alder";
		case BASSWOOD:
			return "Basswood";
		case MAHOGANY:
			return "Mahogany";
		case WALNUT:
			return "Walnut";
		}
		return null;
	}
}
