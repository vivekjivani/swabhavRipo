package com.techlab.cell;

import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIsAlredyMarkedException;

public class Cell {
	private Mark cellState;

	public Cell() {
		this.cellState = Mark.EMPTY;
	}

	public Mark getCellState() {
		return cellState;
	}

	public void setCellState(Mark cellState) throws CellIsAlredyMarkedException {
		if (!isCellEmpty())
			throw new CellIsAlredyMarkedException();
		this.cellState = cellState;
	}

	private boolean isCellEmpty() {
		if (this.cellState == Mark.EMPTY) {
			return true;
		}
		return false;
	}
}
