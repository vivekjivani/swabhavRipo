package com.techlabs.game;

import com.techlabs.exception.MarkerAlreadyAssignedException;

public class Cell {

	public Marker marker;
	
	

	public Cell() {
		this.marker=Marker.EMPTY;
	}

	
	public Marker getMarker() {
		return marker;
	}


	public void setMarker(Marker marker) {
		if(this.marker==Marker.EMPTY)
			this.marker = marker;
		else
			throw new MarkerAlreadyAssignedException();
			
		
	}


	public void clear() {
		marker=Marker.EMPTY;
	}

	
}