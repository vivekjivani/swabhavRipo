package com.techlab.game.test;

import java.util.Scanner;

import com.techclab.game.Game;
import com.techlab.enums.GameStatus;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIsAlredyMarkedException;
import com.techlab.player.Player;

public class GameTest {
	public static void main(String args[]) throws CellIsAlredyMarkedException {
		Game game = new Game();
		Player player1 = new Player("vivek", Mark.O);
		Player player2 = new Player("darshan", Mark.X);
		int flag = 1;
		Scanner scanner = new Scanner(System.in); 
		int cellNumber;
		while(true) {
			if(flag==1) {
				System.out.println("Player 1 Enetr cellNumebr:");
				cellNumber = scanner.nextInt();
				game.makeMove(player1, cellNumber);
				flag+=1;
			}
			if(game.getStatus()==GameStatus.Win || game.getStatus()==GameStatus.Draw) {
				break;
			}
			if(flag==2) {
				System.out.println("Player 2 Enetr cellNumebr:");
				cellNumber = scanner.nextInt();
				game.makeMove(player2, cellNumber);
				flag-=1;
			}
			if(game.getStatus()==GameStatus.Win || game.getStatus()==GameStatus.Draw) {
				break;
			}
		}
	}
}
