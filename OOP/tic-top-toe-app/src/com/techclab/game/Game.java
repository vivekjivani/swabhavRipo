package com.techclab.game;

import com.techlab.board.Board;
import com.techlab.enums.GameStatus;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIsAlredyMarkedException;
import com.techlab.player.Player;
import com.techlab.resultAnalyzer.ResultAnalyzer;

public class Game {
	
	private Board board;
	private GameStatus status;
	private ResultAnalyzer analyzer;
	public Game() {
		board = new Board();
		status = GameStatus.InProgress;
		analyzer = new ResultAnalyzer(board);
	}
	
	public GameStatus getStatus() {
		return status;
	}

	public void makeMove(Player p, int cellNumber) throws CellIsAlredyMarkedException {
		board.putMarkOnCell(p.getMark(), cellNumber);
		status = this.updateGameStatus();
	}
	
	public Mark getMarkOnCell(int cellNumber) {
		return board.getMarkOnCell(cellNumber);
	}
	
	private GameStatus updateGameStatus() {
		status = analyzer.checkGameStatus();
		if(status == GameStatus.Draw) {
			return status;
		}
		if(status == GameStatus.Win) {
			return status;
		}
		return status;
	}
}
