package com.techlabs.game_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.techlabs.exception.CellIsAlredyMarkedException;
import com.techlabs.game.Game;
import com.techlabs.game.GameState;

public class GameFrameListner implements ActionListener{

	private GameFrame gameFrame;
	private Game game;
	private String status;
	
	public GameFrameListner(GameFrame gameFrame, Game game) {
		this.gameFrame=gameFrame;
		this.game=game;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		button.setText(game.getCurrentPlayer().getMark().toString());
		status=game.play(0, 0).toString();
		gameFrame.button1.setText(game.getCurrentPlayer().getMark().toString());
		setDetails();
	}

	public void setDetails() {
		gameFrame.setStatus(status);		
		gameFrame.setPlayerName(game.getCurrentPlayer().getName());
		if (status == "WIN") {
			gameFrame.setStatus(status);
			JOptionPane.showMessageDialog(gameFrame, "Winner is " + game.getCurrentTurn().getName(), "GameResult",
					JOptionPane.PLAIN_MESSAGE);
			gameFrame.dispose();
		}
		if (status == "DRAW") {
			gameFrame.setStatus(status);
			JOptionPane.showMessageDialog(gameFrame, status, "GameResult", JOptionPane.PLAIN_MESSAGE);
			gameFrame.dispose();
		}
	}



	}
	

