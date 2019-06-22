package com.techlab.test.cases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.cell.Cell;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIsAlredyMarkedException;

public class CellTest {

	@Test
	public void testCellConstructor_ShouldCreateAnEmptyCell() {
		Cell cell = new Cell();
		Mark expected = Mark.EMPTY;
		Mark actual = cell.getCellState();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCellState_EmptyIsGiven_ResultShouldBeEmpty() throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.EMPTY);
		Mark expected = Mark.EMPTY;
		Mark actual = cell.getCellState();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCellState_XIsGiven_ResultShouldBEX() throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.X);
		Mark expected = Mark.X;
		Mark actual = cell.getCellState();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCellState_OIsGiven_ResultShouldBEO() throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.O);
		Mark expected = Mark.O;
		Mark actual = cell.getCellState();
		assertEquals(expected, actual);
	}

	@Test(expected = com.techlab.exceptions.CellIsAlredyMarkedException.class)
	public void testSetCellState_TryToMarkCellAgainByX_ShouldReturnCellNotEmptyException()
			throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.O);
		cell.setCellState(Mark.X);
	}

	@Test(expected = com.techlab.exceptions.CellIsAlredyMarkedException.class)
	public void testSetCellState_TryToMarkCellAgainByO_ShouldReturnCellNotEmptyException()
			throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.X);
		cell.setCellState(Mark.O);
	}

	@Test(expected = com.techlab.exceptions.CellIsAlredyMarkedException.class)
	public void testSetCellState_TryToSetMarkedCellToEmpty_ShouldReturnCellNotEmptyException()
			throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.X);
		cell.setCellState(Mark.EMPTY);
	}

}
