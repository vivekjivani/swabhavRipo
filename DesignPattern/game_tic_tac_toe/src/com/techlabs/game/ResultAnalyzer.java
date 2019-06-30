package com.techlabs.game;


public class ResultAnalyzer {
	
	private Board board;
	
	private static int ROWS=3;
	private static int COLUMNS=3;
	
	
	
	public ResultAnalyzer(Board board) {
		this.board=board;
	}
	
	public GameState analyzeResult()
	{
		if(isDraw()==true)
		{
			return GameState.DRAW;
		}
		
		if(hasWon(Marker.X)==true || hasWon(Marker.O)==true) 
		{
			return GameState.WON;
		}
		if(isBoardFilledOut()==false)
		{
			return GameState.PLAYING;
		}
		return null;
	}
	
	
	//Check for Draw...
	public boolean isDraw()
	{
		if(isBoardFilledOut())
		{
			return true;
		}
		return false;
	}
	
	public boolean isBoardFilledOut() {
		for(int row=0;row<ROWS;row++)
			for(int column=0;column<COLUMNS;column++)
			{
				if(board.getMarkOnCell(row, column)==Marker.EMPTY)
				{
					return false;
				}
			}
		return true;
	}


	//Check for Win...
	public boolean hasWon(Marker theMarker)
	{
		if(checkRowForMark(Marker.X))
		{
			return true;
		}
		if(checkRowForMark(Marker.O))
		{
			return true;
		}
		if(checkColumnForMark(Marker.X))
		{
			return true;
		}
		if(checkColumnForMark(Marker.O))
		{
			return true;
		}
		if(checkDiagonalForMark(Marker.X))
		{
			return true;
		}
		if(checkDiagonalForMark(Marker.O))
		{
			return true;
		}
		return false;
	}

	private boolean checkDiagonalForMark(Marker theMarker) {
		if(board.getMarkOnCell(0, 0)==theMarker && board.getMarkOnCell(1, 1)==theMarker && board.getMarkOnCell(2, 2)==theMarker)
			return true;
		if(board.getMarkOnCell(0, 2)==theMarker && board.getMarkOnCell(1, 1)==theMarker && board.getMarkOnCell(2, 0)==theMarker)
			return true;
		return false;
	}

	private boolean checkColumnForMark(Marker theMarker) {
		if(board.getMarkOnCell(0, 0)==theMarker && board.getMarkOnCell(1, 0)==theMarker && board.getMarkOnCell(2, 0)==theMarker)
			return true;
		if(board.getMarkOnCell(0, 1)==theMarker && board.getMarkOnCell(1, 1)==theMarker && board.getMarkOnCell(2, 1)==theMarker)
			return true;
		if(board.getMarkOnCell(0, 2)==theMarker && board.getMarkOnCell(1, 2)==theMarker && board.getMarkOnCell(2, 2)==theMarker)
			return true;
		return false;
	}

	private boolean checkRowForMark(Marker theMarker) {
		if(board.getMarkOnCell(0, 0)==theMarker && board.getMarkOnCell(0, 1)==theMarker && board.getMarkOnCell(0, 2)==theMarker)
			return true;
		if(board.getMarkOnCell(1, 0)==theMarker && board.getMarkOnCell(1, 1)==theMarker && board.getMarkOnCell(1, 2)==theMarker)
			return true;
		if(board.getMarkOnCell(2, 0)==theMarker && board.getMarkOnCell(2, 1)==theMarker && board.getMarkOnCell(2, 2)==theMarker)
			return true;
		return false;
	}
	

}
	
	