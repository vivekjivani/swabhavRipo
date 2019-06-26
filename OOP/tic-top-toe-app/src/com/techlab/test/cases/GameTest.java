package com.techlab.test.cases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techclab.game.Game;
import com.techlab.board.Board;
import com.techlab.enums.GameStatus;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIndexOutOfBound;
import com.techlab.exceptions.CellIsAlredyMarkedException;
import com.techlab.player.Player;

public class GameTest {

	@Test
	public void testGameConstructor_RunningConstructor_BoardShouldBeInitializedWithEmptyCell() {
		Player playerOne = new Player("vivek",Mark.O);
		Player playerTwo = new Player("darshan",Mark.X);
		Board board = new Board();
		Game game = new Game(playerOne, playerTwo);
		Mark expected = Mark.EMPTY;
		for(int index=0 ; index<board.getBoardSize() ; index++) {
			Mark actual = board.getMarkOnCell(index);
			assertEquals(expected, actual);
		}
	}
	
	@Test
	public void testStartGame_StartingGame_CurrentPlayerShouldBePlayer1() {
		Player playerOne = new Player("vivek",Mark.O);
		Player playerTwo = new Player("darshan",Mark.X);
		Game game = new Game(playerOne, playerTwo);
		System.out.println(game.getMOVE_COUNTER());
		String expected = playerOne.getName();
		String actual = game.getCurrentPlayer().getName();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testStartGame_MakingMove_CurrentPlayerShouldBePlayer2() throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("vivek",Mark.O);
		Player playerTwo = new Player("darshan",Mark.X);
		Game game = new Game(playerOne, playerTwo);
		game.play(0);
		System.out.println(game.getMOVE_COUNTER());
		String expected = playerTwo.getName();
		String actual = game.getCurrentPlayer().getName();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testStartGame_StepsGivenToWinPlayer1_ResultShouldBePlayer1IsWinner() throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("vivek",Mark.O);
		Player playerTwo = new Player("darshan",Mark.X);
		Game game = new Game(playerOne, playerTwo);
		GameStatus expected = GameStatus.WIN;
		GameStatus status = game.play(0);
		status = game.play(4);
		status = game.play(1);
		status = game.play(3);
		status = game.play(2);
		GameStatus actual = status;
		assertEquals(expected, actual);
		 
	}
	
	@Test
	public void testStartGame_StepsGivenToWinPlayer2_ResultShouldBePlayer2IsWinner() throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("vivek",Mark.O);
		Player playerTwo = new Player("darshan",Mark.X);
		Game game = new Game(playerOne, playerTwo);
		GameStatus expected = GameStatus.WIN;
		GameStatus status = game.play(0);
		status = game.play(3);
		status = game.play(6);
		status = game.play(4);
		status = game.play(2);
		status = game.play(5);
		GameStatus actual = status;
		assertEquals(expected, actual);
		 
	}
}
