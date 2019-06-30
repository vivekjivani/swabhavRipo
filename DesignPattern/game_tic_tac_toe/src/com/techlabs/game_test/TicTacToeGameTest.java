package com.techlabs.game_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.techlabs.exception.CellIndexOutOfBound;
import com.techlabs.exception.CellIsAlredyMarkedException;
import com.techlabs.game.Board;
import com.techlabs.game.Game;
import com.techlabs.game.GameState;
import com.techlabs.game.Marker;
import com.techlabs.game.Player;
import com.techlabs.game.ResultAnalyzer;

public class TicTacToeGameTest {
	
	private static GameState status=GameState.PLAYING;
	
	public static void main(String args[]) throws CellIsAlredyMarkedException, CellIndexOutOfBound, IOException {
		Player player1 = new Player("Chirag Shah", Marker.O);
		Player player2 = new Player("Dev Shah", Marker.X);
		Board board=new Board();
		ResultAnalyzer analyzer=new ResultAnalyzer(board);
		Game game = new Game(player1, player2);
		game.showBoard();
		System.out.println();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(status==GameState.PLAYING)
		{
			System.out.println();
			System.out.println("Enter row: ");
			String b1=br.readLine();     
		    int row=Integer.parseInt(b1);
		    System.out.println("Enter column: ");
		    b1=br.readLine();        
		    int column=Integer.parseInt(b1);
		   
		    status=game.play(row, column);
		    System.out.println();
		    game.showBoard();
	
		    if(status==GameState.WON || status==GameState.DRAW)
		    {
		    	System.out.println();
		    	System.out.println("Current Status: "+ status);
		    	break;
		    }
		    System.out.println();
		    System.out.println("Current Status: "+analyzer.analyzeResult());
		}
	}

}
