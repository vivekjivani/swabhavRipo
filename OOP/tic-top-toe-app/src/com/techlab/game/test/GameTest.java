package com.techlab.game.test;

import com.techlab.exceptions.CellIndexOutOfBound;
import com.techlab.exceptions.CellIsAlredyMarkedException;
import com.techlab.game.frame.PlayerFrame;

public class GameTest {
	public static void main(String args[]) throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		new PlayerFrame();
	}
}
