package com.techlab.test.cases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.board.Board;
import com.techlab.enums.GameStatus;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIsAlredyMarkedException;
import com.techlab.resultAnalyzer.ResultAnalyzer;

public class ResultAnalyzerTest {

	@Test
	public void testCheckForWin_ThreeSameMarkinRowGiven_ResultShouldBeWin() throws CellIsAlredyMarkedException {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.putMarkOnCell(Mark.X, 0);
		board.putMarkOnCell(Mark.X, 1);
		board.putMarkOnCell(Mark.X, 2);
		boolean expected = true;
		boolean actual = analyzer.checkForWin();
		assertEquals(expected, actual);
	}

	@Test
	public void testCheckForWin_ThreeSameMarkinColumn_ResultShouldBeWin() throws CellIsAlredyMarkedException {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.putMarkOnCell(Mark.X, 1);
		board.putMarkOnCell(Mark.X, 4);
		board.putMarkOnCell(Mark.X, 7);
		boolean expected = true;
		boolean actual = analyzer.checkForWin();
		assertEquals(expected, actual);
	}

	@Test
	public void testCheckForWin_ThreeSameMarkinDiogonal_ResultShouldBeWin() throws CellIsAlredyMarkedException {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.putMarkOnCell(Mark.X, 0);
		board.putMarkOnCell(Mark.X, 4);
		board.putMarkOnCell(Mark.X, 8);
		boolean expected = true;
		boolean actual = analyzer.checkForWin();
		assertEquals(expected, actual);
	}

	@Test
	public void testCheckForDraw_BoardIsFilledOut_ResultShouldBeDraw() throws CellIsAlredyMarkedException {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.putMarkOnCell(Mark.X, 0);
		board.putMarkOnCell(Mark.O, 1);
		board.putMarkOnCell(Mark.X, 2);
		board.putMarkOnCell(Mark.O, 3);
		board.putMarkOnCell(Mark.X, 4);
		board.putMarkOnCell(Mark.O, 5);
		board.putMarkOnCell(Mark.X, 6);
		board.putMarkOnCell(Mark.O, 7);
		board.putMarkOnCell(Mark.X, 8);
		boolean expected = true;
		boolean actual = analyzer.checkForDraw();
		assertEquals(expected, actual);
	}

	@Test
	public void testCheckForDraw_BoardIsNotFilledOut_ResultShouldShouldBeFalse() throws CellIsAlredyMarkedException {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.putMarkOnCell(Mark.X, 0);
		board.putMarkOnCell(Mark.O, 1);
		board.putMarkOnCell(Mark.X, 2);
		board.putMarkOnCell(Mark.O, 3);
		boolean expected = false;
		boolean actual = analyzer.checkForDraw();
		assertEquals(expected, actual);
	}

	@Test
	public void testIsBoardFilledOut_BoardIsNotFilledOut_ResultShouldBeFalse() throws CellIsAlredyMarkedException {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.putMarkOnCell(Mark.X, 0);
		board.putMarkOnCell(Mark.O, 1);
		board.putMarkOnCell(Mark.X, 2);
		board.putMarkOnCell(Mark.O, 3);
		board.putMarkOnCell(Mark.X, 4);
		boolean expected = false;
		boolean actual = analyzer.IsBoardFillOut();
		assertEquals(expected, actual);
	}

	@Test
	public void testIsBoardFilledOut_BoardIsFilledOut_ResultShouldBeTrue() throws CellIsAlredyMarkedException {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.putMarkOnCell(Mark.X, 0);
		board.putMarkOnCell(Mark.O, 1);
		board.putMarkOnCell(Mark.X, 2);
		board.putMarkOnCell(Mark.O, 3);
		board.putMarkOnCell(Mark.X, 4);
		board.putMarkOnCell(Mark.O, 5);
		board.putMarkOnCell(Mark.X, 6);
		board.putMarkOnCell(Mark.O, 7);
		board.putMarkOnCell(Mark.X, 8);
		boolean expected = true;
		boolean actual = analyzer.IsBoardFillOut();
		assertEquals(expected, actual);
	}

}
