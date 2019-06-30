package com.techlabs.test_class;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.techlabs.exception.MarkerAlreadyAssignedException;
import com.techlabs.game.Board;
import com.techlabs.game.Cell;
import com.techlabs.game.Marker;

public class BoardTest {

	@Test(expected = MarkerAlreadyAssignedException.class)
	public void putMarkInCellWhenMarkAlreadyAssigned() {
		Board b1=new Board();
		b1.putMarkOnCell(Marker.O, 1, 1);
		b1.putMarkOnCell(Marker.X,1, 1);
	}

	@Test
	public void getMarkXIfCellIsMarkedWithX() {
		Board b2=new Board();
		b2.putMarkOnCell(Marker.X, 1, 1);
		Marker actual=b2.getMarkOnCell(1,1);
		Marker expected=Marker.X;
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMarkOIfCellIsMarkedWithO() {
		Board b3=new Board();
		b3.putMarkOnCell(Marker.O, 1, 0);
		Marker actual=b3.getMarkOnCell(1,0);
		Marker expected=Marker.O;
		assertEquals(expected, actual);
	}
	
	@Test
	public void isBoardInitialize()
	{
		Board b=new Board();
		Cell cellsArray[][]=b.getCellsArray();
		int acceptedRow=3;
		int actualRow=cellsArray.length;
		int acceptedColumn=3;
		int actualColumn=cellsArray[0].length;
		assertEquals(acceptedRow, actualRow);
		assertEquals(acceptedColumn, actualColumn);
	}
}
