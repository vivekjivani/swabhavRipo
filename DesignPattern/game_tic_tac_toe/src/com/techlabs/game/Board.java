package com.techlabs.game;

import com.techlabs.exception.MarkerAlreadyAssignedException;

public class Board {
	
	private static int ROWS=3;
	private static int COLUMNS=3;
	
		
	Cell cells[][];
	
	
	public Board() {
		cells=new Cell[ROWS][COLUMNS];
		for(int row=0;row<ROWS;row++)
			for(int column=0;column<COLUMNS;column++)
			{
				cells[row][column]=new Cell();
			}
	}


	public void putMarkOnCell(Marker mark,int row,int column)
	{
		if(cells[row][column].marker==Marker.EMPTY)
			cells[row][column].setMarker(mark);
		else
			throw new MarkerAlreadyAssignedException();
	}
	
	public Marker getMarkOnCell(int row,int column)
	{
		return cells[row][column].getMarker();
	}
	
	public int getBoardSize() {
		return cells.length;
	}

	public Cell[][] getCellsArray() {
		return cells;
	}
		
}
