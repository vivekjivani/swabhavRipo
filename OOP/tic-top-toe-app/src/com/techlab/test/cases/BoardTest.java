package com.techlab.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.board.Board;
import com.techlab.cell.Cell;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIsAlredyMarkedException;

public class BoardTest {

	@Test
	public void testBoardConstructor_CallingConstructor_ShouldInitializeCellsArrayBy9Cell() {
		Board board = new Board();
		Cell[] cellArray = board.getCellsArray();
		int expected = 9;
		int actual = cellArray.length;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPutMarkOnCell_MarkingCell0ByX_OnCell0ResultShouldBeX() throws CellIsAlredyMarkedException {
		Board board = new Board();
		int cellNumber = 0;
		board.putMarkOnCell(Mark.X, cellNumber);
		Mark expectedMark = Mark.X;
		Mark actualMark = board.getMarkOnCell(cellNumber);
		assertEquals(expectedMark, actualMark);
	}

	@Test(expected = com.techlab.exceptions.CellIsAlredyMarkedException.class)
	public void testPutMarkOnCell_tryingToRemarkCell0_ResultShouldBeThrowException() throws CellIsAlredyMarkedException {
		Board board = new Board();
		board.putMarkOnCell(Mark.O, 0);
		board.putMarkOnCell(Mark.X, 0);
	}
}
