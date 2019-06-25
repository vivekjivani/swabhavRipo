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
	public void testCheckGameStatus_RowFilledWithO_ResultShouldBeWin() throws CellIsAlredyMarkedException {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		
	}
	
//	@Test
//	public void testCheckGameStatus_ColumnFilledWithO_ResultShouldBeWin() throws CellIsAlredyMarkedException {
//		Board board = new Board();
//		ResultAnalyzer analyzer = new ResultAnalyzer(board);
//		board.putMarkOnCell(Mark.O, 0);
//		board.putMarkOnCell(Mark.O, 3);
//		board.putMarkOnCell(Mark.O, 6);
//		GameStatus expected = GameStatus.Win;
//		GameStatus actual=analyzer.checkGameStatus();
//		assertEquals(expected, actual);	
//	}
//	
//	@Test
//	public void testCheckGameStatus_DiagonalOneISFilledWithX_ResultShouldBeWin() throws CellIsAlredyMarkedException {
//		Board board = new Board();
//		ResultAnalyzer analyzer = new ResultAnalyzer(board);
//		board.putMarkOnCell(Mark.O, 0);
//		board.putMarkOnCell(Mark.O, 4);
//		board.putMarkOnCell(Mark.O, 8);
//		GameStatus expected = GameStatus.Win;
//		GameStatus actual=analyzer.checkGameStatus();
//		assertEquals(expected, actual);	
//	}
//	
//	@Test
//	public void testCheckGameStatus_DiagonalTwoISFilledWithX_ResultShouldBeWin() throws CellIsAlredyMarkedException {
//		Board board = new Board();
//		ResultAnalyzer analyzer = new ResultAnalyzer(board);
//		board.putMarkOnCell(Mark.O, 2);
//		board.putMarkOnCell(Mark.O, 4);
//		board.putMarkOnCell(Mark.O, 6);
//		GameStatus expected = GameStatus.Win;
//		GameStatus actual=analyzer.checkGameStatus();
//		assertEquals(expected, actual);	
//	}
}
