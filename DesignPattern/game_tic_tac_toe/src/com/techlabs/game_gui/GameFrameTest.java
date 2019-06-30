package com.techlabs.game_gui;

import com.techlabs.game.Game;
import com.techlabs.game.Marker;
import com.techlabs.game.Player;

public class GameFrameTest {
	
	public static void main(String args[])
	{
		Player player1=new Player("Chirag",Marker.X);
		Player player2=new Player("Dev", Marker.O);
		Game game=new Game(player1, player2);
		GameFrame gameFrame1=new GameFrame(game);
	}

}
