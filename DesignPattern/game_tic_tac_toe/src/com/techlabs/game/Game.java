package com.techlabs.game;

import java.awt.Component;

import com.techlabs.exception.CellIsAlredyMarkedException;
import com.techlabs.exception.IllegalAssignException;

public class Game {
	
	private Board board;
	private GameState status=GameState.PLAYING;
	private ResultAnalyzer analyzer;
	private Player p1,p2,currentPlayer;
	private int playerMoveCount=1;
	
	

	public Game(Player player1, Player player2) {
		p1=player1;
		p2=player2;
		board=new Board();
		analyzer=new ResultAnalyzer(board);
		currentPlayer=p1;
	}
	
	public void makePlayerMove(int row,int column) throws CellIsAlredyMarkedException
	{
		board.putMarkOnCell(currentPlayer.getMark(), row, column);
		playerMoveCount++;
	}
	
	public GameState play(int row,int column)
	{
		currentPlayer=getCurrentPlayer();
		makePlayerMove(row, column);
		if(analyzer.analyzeResult()==GameState.DRAW)
		{
			status=GameState.DRAW;
		}
		if(analyzer.analyzeResult()==GameState.WON)
		{
			status=GameState.WON;
		}
		if(analyzer.analyzeResult()==GameState.PLAYING)
		{
			status=GameState.PLAYING;
		}
		return status;
	}
	
	public Player getCurrentPlayer() 
	{
		if(playerMoveCount%2==0)
		{
			return p2;
		}
		return p1;
	}

	public void showBoard()
	{
		for(int row=0;row<board.getBoardSize();row++)
		{
			for(int column=0;column<board.getBoardSize();column++)
			{
				System.out.print(board.getMarkOnCell(row, column)+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	public int getMoveCount()
	{
		return playerMoveCount;
	}

	public GameState getStatus() {
		return status;
	}

	public Player getCurrentTurn() {
		return currentPlayer;
	}

	
	

}
