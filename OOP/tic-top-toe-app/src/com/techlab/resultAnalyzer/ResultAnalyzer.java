package com.techlab.resultAnalyzer;

import com.techlab.board.Board;
import com.techlab.enums.GameStatus;
import com.techlab.enums.Mark;

public class ResultAnalyzer {
	private Board board;
	private static int NUMBER_TO_GET_NEXT_ROW = 1;
	private static int NUMBER_TO_GET_NEXT_COLUMN = 3;
	private static int NUMBER_OF_ROW = 3;
	private static int NUMBER_OF_COLUMN = 3;
	private int[] diagonal1 = { 0, 4, 8 };
	private int[] diagonal2 = { 2, 4, 6 };

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public GameStatus checkGameStatus() {
		int START_INDEX = 0;
		for (int index = 0; index < NUMBER_OF_ROW; index += NUMBER_TO_GET_NEXT_COLUMN) {
			if ((board.getMarkOnCell(START_INDEX) == Mark.O
					&& board.getMarkOnCell(START_INDEX + NUMBER_TO_GET_NEXT_ROW) == Mark.O
					&& board.getMarkOnCell(START_INDEX + NUMBER_TO_GET_NEXT_ROW + NUMBER_TO_GET_NEXT_ROW) == Mark.O)
					|| (board.getMarkOnCell(START_INDEX) == Mark.X
							&& board.getMarkOnCell(START_INDEX + NUMBER_TO_GET_NEXT_ROW) == Mark.X
							&& board.getMarkOnCell(
									START_INDEX + NUMBER_TO_GET_NEXT_ROW + NUMBER_TO_GET_NEXT_ROW) == Mark.X)) {
				return GameStatus.Win;
			}
		}
		for (int index = 0; index < NUMBER_OF_COLUMN; index += NUMBER_TO_GET_NEXT_ROW) {
			if ((board.getMarkOnCell(START_INDEX) == Mark.O
					&& board.getMarkOnCell(START_INDEX + NUMBER_TO_GET_NEXT_COLUMN) == Mark.O
					&& board.getMarkOnCell(
							START_INDEX + NUMBER_TO_GET_NEXT_COLUMN + NUMBER_TO_GET_NEXT_COLUMN) == Mark.O)
					|| (board.getMarkOnCell(START_INDEX) == Mark.X
							&& board.getMarkOnCell(START_INDEX + NUMBER_TO_GET_NEXT_COLUMN) == Mark.X
							&& board.getMarkOnCell(
									START_INDEX + NUMBER_TO_GET_NEXT_COLUMN + NUMBER_TO_GET_NEXT_COLUMN) == Mark.X)) {
				return GameStatus.Win;
			}
		}

		for (int index = 0; index < diagonal1.length; index++) {
			if (((board.getMarkOnCell(diagonal1[index++]) == Mark.O))
					&& (board.getMarkOnCell(diagonal1[index++]) == Mark.X)) {
				return GameStatus.Win;
			}
		}
		int index = 0;
		if (board.getMarkOnCell(diagonal1[index++]) == Mark.O && board.getMarkOnCell(diagonal1[index++]) == Mark.O
				&& board.getMarkOnCell(diagonal1[index]) == Mark.O) {
			return GameStatus.Win;
		}
		index = 0;
		if (board.getMarkOnCell(diagonal1[index++]) == Mark.X && board.getMarkOnCell(diagonal1[index++]) == Mark.X
				&& board.getMarkOnCell(diagonal1[index]) == Mark.X) {
			return GameStatus.Win;
		}
		index = 0;
		if (board.getMarkOnCell(diagonal2[index++]) == Mark.O && board.getMarkOnCell(diagonal2[index++]) == Mark.O
				&& board.getMarkOnCell(diagonal2[index]) == Mark.O) {
			return GameStatus.Win;
		}
		index = 0;
		if (board.getMarkOnCell(diagonal2[index++]) == Mark.X && board.getMarkOnCell(diagonal2[index++]) == Mark.X
				&& board.getMarkOnCell(diagonal2[index]) == Mark.X) {
			return GameStatus.Win;
		}

		if (board.isFilledOut()) {
			return GameStatus.Draw;
		}
		return GameStatus.InProgress;
	}
}
