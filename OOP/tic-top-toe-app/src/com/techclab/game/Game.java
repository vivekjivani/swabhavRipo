package com.techclab.game;

import com.techlab.board.Board;
import com.techlab.enums.GameStatus;
import com.techlab.exceptions.CellIsAlredyMarkedException;
import com.techlab.player.Player;
import com.techlab.resultAnalyzer.ResultAnalyzer;

public class Game {

	private Board board;
	private ResultAnalyzer analyzer;
	private Player p1, p2, currentPlayer;
	private GameStatus status=GameStatus.INPROGRESS;
	private int moveCounter = 1;

	public Game(Player playerOne, Player playerTwo) {
		board = new Board();
		analyzer = new ResultAnalyzer(board);
		p1 = playerOne;
		p2 = playerTwo;
		currentPlayer = p1;
	}

	public int getMOVE_COUNTER() {
		return moveCounter;
	}

	public void makeMove(Player p, int cellNumber) throws CellIsAlredyMarkedException {
		board.putMarkOnCell(p.getMark(), cellNumber);
		moveCounter++;
	}
	
	public GameStatus play(int cellNumber) throws CellIsAlredyMarkedException {
		currentPlayer = getCurrentPlayer();
		makeMove(currentPlayer, cellNumber);
		if(analyzer.checkForWin()) {
			status = GameStatus.WIN;
		}
		if(analyzer.checkForDraw()) {
			status = GameStatus.DRAW;
		}
		return status;
	}

	public Player getCurrentPlayer() {
		if (moveCounter % 2 == 0) {
			return p2;
		}
		return p1;
	}

	public void displayBoard() {
		for (int index = 0; index < board.getBoardSize(); index++) {
			System.out.println(board.getMarkOnCell(index++) + "\t" + board.getMarkOnCell(index++) + "\t"
					+ board.getMarkOnCell(index));
		}
	}
}
