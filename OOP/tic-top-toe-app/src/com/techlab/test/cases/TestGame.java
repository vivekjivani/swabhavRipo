package com.techlab.test.cases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techclab.game.Game;
import com.techlab.board.Board;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIsAlredyMarkedException;
import com.techlab.player.Player;

public class TestGame {

	@Test
	public void testMakeMove_PlayerPutMarkOnCell1_Cell1ShouldMarked() throws CellIsAlredyMarkedException {
		//Board board = new Board();
		Game game = new Game();
		Player player1 = new Player("vievk", Mark.O);
		game.makeMove(player1, 0);
		Mark expected = Mark.O;
		Mark actual = game.getMarkOnCell(0);
		assertEquals(expected, actual);
	}
	
	@Test(expected = com.techlab.exceptions.CellIsAlredyMarkedException.class)
	public void testMakeMove_PlayerReMarkOnCell_ShouldThrowCellIsAlredyMarkedException() throws CellIsAlredyMarkedException {
		Game game = new Game();
		Board board = new Board();
		Player player1 = new Player("vievk", Mark.O);
		game.makeMove(player1, 0);
		game.makeMove(player1, 0);		
	}

}
