package com.techlab.listners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.techclab.game.Game;
import com.techlab.enums.Mark;
import com.techlab.exceptions.CellIsAlredyMarkedException;
import com.techlab.game.frame.GameFrame;
import com.techlab.game.frame.PlayerFrame;
import com.techlab.player.Player;

public class PlayerFrameListner implements ActionListener {
	private PlayerFrame frame;

	public PlayerFrameListner(PlayerFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Player playerOne = new Player(PlayerFrame.getPlayer1Name(), Mark.O);
		Player playerrTwo = new Player(PlayerFrame.getPlayer2Name(), Mark.X);
		Game game = new Game(playerOne, playerrTwo);
		this.frame.dispose();
		new GameFrame(game).setVisible(true);
	}

	public static void main(String args[]) throws CellIsAlredyMarkedException {
		new PlayerFrame();
	}
}
