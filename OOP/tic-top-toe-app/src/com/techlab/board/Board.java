package com.techlab.board;

import com.techlab.cell.Cell;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIsAlredyMarkedException;

public class Board {
	private Cell[] cellsArray;
	private static int NUMBER_OF_CELL = 9;

	public Board() {
		cellsArray = new Cell[NUMBER_OF_CELL];
		for (int index = 0; index < NUMBER_OF_CELL; index++)
			cellsArray[index] = new Cell();
	}

	public void putMarkOnCell(Mark mark, int cellNumber) throws CellIsAlredyMarkedException {
		cellsArray[cellNumber].setCellState(mark);
	}
	
	public Mark getMarkOnCell(int cellNumber) {
		return cellsArray[cellNumber].getCellState();
	}
	
	public Cell[] getCellsArray() {
		return cellsArray;
	}
		
	public boolean isFilledOut(){
		for (int index = 0; index < NUMBER_OF_CELL; index++) {
			if(this.getMarkOnCell(index) != Mark.EMPTY) {
				return true;
			}
		}
		return false;
	}
}
