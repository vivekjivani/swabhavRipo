package com.techlab.game.frame;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.techclab.game.Game;
import com.techlab.listners.GameFrameListner;
import com.techlab.player.Player;

public class GameFrame extends JFrame {
	private Game game;
	private Player currentPlayer;
	private ArrayList<JButton> listOfJButton;
	private static int NUMBER_OF_BUTTON = 9;
	private JLabel playerName, status;

	public GameFrame(Game game) {
		this.game = game;
		currentPlayer = game.getCurrentPlayer();
		this.listOfJButton = new ArrayList<JButton>();
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

	public void initializeFrame() {
		JPanel panel1 = new JPanel();

		JLabel currentPlayer = new JLabel("CurrentPlayer : ");
		JLabel gameStatus = new JLabel("GameStatus : ");
		playerName = new JLabel(game.getCurrentPlayer().getName());
		status = new JLabel(game.getStatus().toString());

		panel1.add(currentPlayer);
		panel1.add(playerName);
		panel1.add(gameStatus);
		panel1.add(status);

		GameFrameListner listner = new GameFrameListner(this, this.game);

		JPanel panel2 = new JPanel();
		for (int index = 0; index < NUMBER_OF_BUTTON; index++) {
			listOfJButton.add(new JButton("_"));
			listOfJButton.get(index).setName("" + index);
			listOfJButton.get(index).setSize(20, 20);
			listOfJButton.get(index).addActionListener(listner);
			panel2.add(listOfJButton.get(index));
		}
		panel1.setLayout(new GridLayout(1, 2));
		panel2.setLayout(new GridLayout(3, 3, 5, 5));
		this.add(panel1);
		this.add(panel2);
		panel1.setSize(500, 100);
		setLayout(new GridLayout(2, 1));
		setSize(500, 500);
	}
}
