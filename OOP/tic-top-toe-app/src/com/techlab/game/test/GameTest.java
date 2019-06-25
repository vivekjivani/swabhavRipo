package com.techlab.game.test;

import com.techclab.game.Game;
import com.techlab.exceptions.CellIndexOutOfBound;
import com.techlab.exceptions.CellIsAlredyMarkedException;

public class GameTest {
	public static void main(String args[]) throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Game game = new Game();
		String message = game.startGame();
		System.out.println(message);
	}
}
