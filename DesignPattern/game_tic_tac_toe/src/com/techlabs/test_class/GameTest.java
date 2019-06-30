package com.techlabs.test_class;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techlabs.game.Board;
import com.techlabs.game.Game;
import com.techlabs.game.GameState;
import com.techlabs.game.Marker;
import com.techlabs.game.Player;

public class GameTest {

	@Test
	public void testGameConstructorToInitializeBoardEmpty() {
		Player player1 = new Player("Chirag Shah", Marker.O);
		Player player2 = new Player("Dev Shah", Marker.X);
		Board board=new Board();
		Game game=new Game(player1, player2);
		Marker expected=Marker.EMPTY;
		for(int row=0;row<board.getBoardSize();row++)
		{
			for(int column=0;column<board.getBoardSize();column++)
			{
				Marker actual=board.getMarkOnCell(row, column);
				assertEquals(expected, actual);
			}
		}
	}
	

	@Test
	public void checkCurrentPlayerBeOne() {
		Player player1 = new Player("Chirag Shah", Marker.O);
		Player player2 = new Player("Dev Shah", Marker.X);
		Board board=new Board();
		Game game=new Game(player1, player2);
		System.out.println(game.getMoveCount());
		String expected=player1.getName();
		String actual=game.getCurrentPlayer().getName();
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkCurrentPlayerBeTwo() {
		Player player1 = new Player("Chirag Shah", Marker.O);
		Player player2 = new Player("Dev Shah", Marker.X);
		Board board=new Board();
		Game game=new Game(player1, player2);
		game.play(0, 0);
		System.out.println(game.getMoveCount());
		String expected=player2.getName();
		String actual=game.getCurrentPlayer().getName();
		assertEquals(expected, actual);
	}
	

	@Test
	public void testPlayWinnerShouldBePlayerOne() {
		Player player1 = new Player("Chirag Shah", Marker.O);
		Player player2 = new Player("Dev Shah", Marker.X);
		Board board=new Board();
		GameState expected=GameState.WON;
		Game game=new Game(player1, player2);
		GameState status=game.play(0, 0);
		status=game.play(2, 2);
		status=game.play(0, 1);
		status=game.play(2,0);
		status=game.play(0, 2);
		GameState actual=status;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPlayWinnerShouldBePlayerTwo() {
		Player player1 = new Player("Chirag Shah", Marker.O);
		Player player2 = new Player("Dev Shah", Marker.X);
		Board board=new Board();
		GameState expected=GameState.WON;
		Game game=new Game(player1, player2);
		GameState status=game.play(2, 2);
		status=game.play(0, 0);
		status=game.play(2, 0);
		status=game.play(0,1);
		status=game.play(1, 2);
		status=game.play(0, 2);
		GameState actual=status;
		assertEquals(expected, actual);
	}

	

}
