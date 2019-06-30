package com.techlabs.test_class;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techlabs.game.Board;
import com.techlabs.game.GameState;
import com.techlabs.game.Marker;
import com.techlabs.game.ResultAnalyzer;

public class ResultAnalyzerTest {

	@Test
	public void testForWinThreeInSameRow() {
		Board board=new Board();
		ResultAnalyzer resultAnalyze=new ResultAnalyzer(board);
		
		board.putMarkOnCell(Marker.X, 0, 0);
		board.putMarkOnCell(Marker.X, 0, 1);
		board.putMarkOnCell(Marker.X, 0, 2);
		GameState actual=resultAnalyze.analyzeResult();
		//boolean actual=resultAnalyze.hasWon(Marker.X);
		GameState expected=GameState.WON;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testForWinThreeInSameColumn() {
		Board board=new Board();
		ResultAnalyzer resultAnalyze=new ResultAnalyzer(board);
		
		board.putMarkOnCell(Marker.X, 0, 0);
		board.putMarkOnCell(Marker.X, 1, 0);
		board.putMarkOnCell(Marker.X, 2, 0);
		
		boolean actual=resultAnalyze.hasWon(Marker.X);
		boolean expected=true;
		assertEquals(expected, actual);
	}

	@Test
	public void testForWinThreeInDiagonal() {
		Board board=new Board();
		ResultAnalyzer resultAnalyze=new ResultAnalyzer(board);
		
		board.putMarkOnCell(Marker.O, 0, 0);
		board.putMarkOnCell(Marker.O, 1, 1);
		board.putMarkOnCell(Marker.O, 2, 2);
		
		boolean actual=resultAnalyze.hasWon(Marker.O);
		boolean expected=true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testForWinThreeInDiagonalReverse() {
		Board board=new Board();
		ResultAnalyzer resultAnalyze=new ResultAnalyzer(board);
		
		board.putMarkOnCell(Marker.X, 2, 0);
		board.putMarkOnCell(Marker.X, 1, 1);
		board.putMarkOnCell(Marker.X, 0, 2);
		
		boolean actual=resultAnalyze.hasWon(Marker.X);
		boolean expected=true;
		assertEquals(expected, actual);
	}

	@Test
	public void testIsDrawWhenBoardEmpty() {
		Board board=new Board();
		ResultAnalyzer resultAnalyze=new ResultAnalyzer(board);
		
		board.putMarkOnCell(Marker.X, 0, 0);
		board.putMarkOnCell(Marker.O, 1, 1);
		board.putMarkOnCell(Marker.X, 0, 2);
		boolean actual=resultAnalyze.isDraw();
		boolean expected=false;
		assertEquals(expected, actual);
		
	}

	@Test
	public void testIsDrawWhenBoardFull() {
		Board board=new Board();
		ResultAnalyzer resultAnalyze=new ResultAnalyzer(board);
		
		board.putMarkOnCell(Marker.O, 0, 0);
		board.putMarkOnCell(Marker.X, 0, 1);
		board.putMarkOnCell(Marker.O, 0, 2);
		
		board.putMarkOnCell(Marker.O, 1, 0);
		board.putMarkOnCell(Marker.O, 1, 1);
		board.putMarkOnCell(Marker.X, 1, 2);
		
		board.putMarkOnCell(Marker.X, 2, 0);
		board.putMarkOnCell(Marker.O, 2, 1);
		board.putMarkOnCell(Marker.X, 2, 2);
		boolean actual=resultAnalyze.isDraw();
		boolean expected=true;
		assertEquals(expected, actual);
		
	}

	

}
