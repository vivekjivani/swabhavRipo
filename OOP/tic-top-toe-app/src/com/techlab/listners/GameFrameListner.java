package com.techlab.listners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.techclab.game.Game;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIsAlredyMarkedException;
import com.techlab.game.frame.GameFrame;
import com.techlab.player.Player;

public class GameFrameListner implements ActionListener {
	private GameFrame frame;
	private Game game;
	private String status;

	public GameFrameListner(GameFrame frame, Game game) {
		this.frame = frame;
		this.game = game;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText(game.getCurrentPlayer().getMark().toString());
		try {
			status = game.play(Integer.parseInt(button.getName())).toString();
			frame.setStatus(status);
			frame.setPlayerName(game.getCurrentPlayer().getName());
			if (status == "WIN") {
				frame.setStatus(status);
				JOptionPane.showMessageDialog(frame, "Winner is " + game.getCurrentTurn().getName(), "GameResult",
						JOptionPane.PLAIN_MESSAGE);
				frame.dispose();
			}
			if (status == "DRAW") {
				frame.setStatus(status);
				JOptionPane.showMessageDialog(frame, status, "GameResult", JOptionPane.PLAIN_MESSAGE);
				frame.dispose();
			}
		} catch (NumberFormatException | CellIsAlredyMarkedException e1) {
			e1.printStackTrace();
		}

	}
}
