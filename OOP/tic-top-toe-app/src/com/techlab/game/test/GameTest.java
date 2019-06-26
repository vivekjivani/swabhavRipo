package com.techlab.game.test;

import com.techclab.game.Game;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIndexOutOfBound;
import com.techlab.exceptions.CellIsAlredyMarkedException;
import com.techlab.player.Player;

public class GameTest {
	public static void main(String args[]) throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player player1 = new Player("vivek", Mark.O);
		Player player2 = new Player("darshan", Mark.X);
		Game game = new Game(player1, player2);
//		String status = game.();
//		System.out.println(status);
	}
}
