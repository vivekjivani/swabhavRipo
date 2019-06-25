package com.techclab.game;

import java.util.Scanner;

import com.techlab.board.Board;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIndexOutOfBound;
import com.techlab.exceptions.CellIsAlredyMarkedException;
import com.techlab.player.Player;
import com.techlab.resultAnalyzer.ResultAnalyzer;

public class Game {

	private Board board;
	private ResultAnalyzer analyzer;
	private Player p1, p2, currentPlayer;
	private String message;
	private static int MOVE_COUNTER = 1;
	private Scanner scanner;

	public Game() {
		board = new Board();
		analyzer = new ResultAnalyzer(board);
		p1 = new Player("vivek", Mark.O);
		p2 = new Player("darshan", Mark.X);
		currentPlayer = p1;
	}

	private void makeMove(Player p, int cellNumber) throws CellIsAlredyMarkedException {
		board.putMarkOnCell(p.getMark(), cellNumber);
	}

	public String startGame() throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		scanner = new Scanner(System.in);
		while (true) {
			currentPlayer = getPlayer();
			System.out.println(currentPlayer.getName() + "'s turn ");
			System.out.println("Enter Cell Number : ");
			int cellNumber = scanner.nextInt();
			if (cellNumber > board.getBoardSize())
				throw new CellIndexOutOfBound();
			makeMove(currentPlayer, cellNumber);
			MOVE_COUNTER++;
			displayBoard();
			if (analyzer.checkForWin()) {
				message = "Winner is : " + currentPlayer.getName();
				return message;
			}

			if (analyzer.checkForDraw()) {
				message = "Game Draw..";
				return message;
			}
		}
	}

	private Player getPlayer() {
		if (MOVE_COUNTER % 2 == 0) {
			return p2;
		}
		return p1;
	}
	
	private void displayBoard() {
		for(int index=0 ; index<board.getBoardSize() ; index++) {
			System.out.println(board.getMarkOnCell(index++)+"\t"+board.getMarkOnCell(index++)+"\t"+board.getMarkOnCell(index));
		}
	}
}
