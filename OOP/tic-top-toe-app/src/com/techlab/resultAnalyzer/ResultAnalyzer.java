package com.techlab.resultAnalyzer;

import com.techlab.board.Board;
import com.techlab.enums.Mark;

public class ResultAnalyzer {
	private Board board;
	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	// Check for win.....
	public boolean checkForWin() {
		if (checkRowForMark(Mark.O)) {
			return true;
		}
		if (checkRowForMark(Mark.X)) {
			return true;
		}
		if (checkColumnForMark(Mark.O)) {
			return true;
		}
		if (checkColumnForMark(Mark.X)) {
			return true;
		}
		if (checkDiagonalForMark(Mark.O)) {
			return true;
		}
		if (checkDiagonalForMark(Mark.X)) {
			return true;
		}
		return false;
	}

	private boolean checkRowForMark(Mark mark) {
		if (board.getMarkOnCell(0) == mark && board.getMarkOnCell(1) == mark && board.getMarkOnCell(2) == mark) {
			return true;
		}
		if (board.getMarkOnCell(3) == mark && board.getMarkOnCell(4) == mark && board.getMarkOnCell(5) == mark) {
			return true;
		}
		if (board.getMarkOnCell(6) == mark && board.getMarkOnCell(7) == mark && board.getMarkOnCell(8) == mark) {
			return true;
		}
		return false;
	}

	private boolean checkColumnForMark(Mark mark) {
		if (board.getMarkOnCell(0) == mark && board.getMarkOnCell(3) == mark && board.getMarkOnCell(6) == mark) {
			return true;
		}
		if (board.getMarkOnCell(1) == mark && board.getMarkOnCell(4) == mark && board.getMarkOnCell(7) == mark) {
			return true;
		}
		if (board.getMarkOnCell(2) == mark && board.getMarkOnCell(5) == mark && board.getMarkOnCell(8) == mark) {
			return true;
		}
		return false;
	}

	private boolean checkDiagonalForMark(Mark mark) {
		if (board.getMarkOnCell(0) == mark && board.getMarkOnCell(4) == mark && board.getMarkOnCell(8) == mark) {
			return true;
		}
		if (board.getMarkOnCell(2) == mark && board.getMarkOnCell(4) == mark && board.getMarkOnCell(6) == mark) {
			return true;
		}
		return false;
	}

	// CheckForDraw
	public boolean checkForDraw() {
		if (IsBoardFillOut()) {
			return true;
		}
		return false;
	}

	public boolean IsBoardFillOut() {
		if ((board.getMarkOnCell(0) == Mark.O) | (board.getMarkOnCell(0) == Mark.X)
				&& (board.getMarkOnCell(1) == Mark.O) | (board.getMarkOnCell(1) == Mark.X)
				&& (board.getMarkOnCell(2) == Mark.O) | (board.getMarkOnCell(2) == Mark.X)
				&& (board.getMarkOnCell(3) == Mark.O) | (board.getMarkOnCell(3) == Mark.X)
				&& (board.getMarkOnCell(4) == Mark.O) | (board.getMarkOnCell(4) == Mark.X)
				&& (board.getMarkOnCell(5) == Mark.O) | (board.getMarkOnCell(5) == Mark.X)
				&& (board.getMarkOnCell(6) == Mark.O) | (board.getMarkOnCell(6) == Mark.X)
				&& (board.getMarkOnCell(7) == Mark.O) | (board.getMarkOnCell(7) == Mark.X)
				&& (board.getMarkOnCell(8) == Mark.O) | (board.getMarkOnCell(8) == Mark.X))
			return true;
		return false;
	}

//	// display board
//	public void displayBoard() {
//		for(int index =0 ; index < SIZE_OF_BOARD ; index++) {
//			System.out.println(board.getMarkOnCell(index));
//		}
//	}

}