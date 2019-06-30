package com.techlabs.game_gui;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.techlabs.game.Game;
import com.techlabs.game.GameState;
import com.techlabs.game.Player;

public class GameFrame extends JFrame{
	
	public JLabel playerName,status;
	public Game game;
	public Player currentPlayer;
	public JButton button1;
	public JButton button2;
	public JButton button3;
	public JButton button4;
	public JButton button5;
	public JButton button6;
	public JButton button7;
	public JButton button8;
	public JButton button9;
	
	public GameFrame(Game game)
	{
		this.game=game;
		currentPlayer=game.getCurrentPlayer();
		this.initializeFrame();
	}


	public void setPlayerName(String playerName) {
		this.playerName.setText(playerName);
	}

	public void setStatus(String status) {
		this.status.setText(status);
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	
	private void initializeFrame() {
		JPanel panel1=new JPanel();
		JLabel currentPlayer = new JLabel("CurrentPlayer : ");
		JLabel gameStatus = new JLabel("GameStatus : ");
		playerName = new JLabel(game.getCurrentPlayer().getName());
		status = new JLabel(game.getStatus().toString());

		panel1.add(currentPlayer);
		panel1.add(playerName);
		panel1.add(gameStatus);
		panel1.add(status);
		
		JPanel panel2=new JPanel();
		
		button1=new JButton(" ");
		button2=new JButton(" ");
		button3=new JButton(" ");
		button4=new JButton(" ");
		button5=new JButton(" ");
		button6=new JButton(" ");
		button7=new JButton(" ");
		button8=new JButton(" ");
		button9=new JButton(" ");
				
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		panel2.add(button8);
		panel2.add(button9);	

		
		GameFrameListner listener=new GameFrameListner(this, this.game);
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		button4.addActionListener(listener);
		button5.addActionListener(listener);
		button6.addActionListener(listener);
		button7.addActionListener(listener);
		button8.addActionListener(listener);
		button9.addActionListener(listener);
		
		panel1.setLayout(new GridLayout(1, 2));
		panel2.setLayout(new GridLayout(3, 3, 5, 5));
		this.add(panel1);
		this.add(panel2);
		panel1.setSize(500, 100);
		setLayout(new GridLayout(2, 1));
		setSize(500, 500);
		this.setVisible(true);
	}
	
	
}
