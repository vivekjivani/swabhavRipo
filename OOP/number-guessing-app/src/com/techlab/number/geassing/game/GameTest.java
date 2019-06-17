package com.techlab.number.geassing.game;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game player=new Game("vivek");
		while(player.status!="win") {
			player.getUserInput();
			player.checkUserInput();
		}
		player.displayHits();
	}

}
