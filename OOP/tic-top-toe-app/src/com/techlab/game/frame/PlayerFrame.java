package com.techlab.game.frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.techlab.listners.PlayerFrameListner;

public class PlayerFrame extends JFrame {
	JPanel panel;
	JLabel player1Label, player2Label;
	static JTextField player1Name, player2Name;
	JButton submit;

	public PlayerFrame() {

		player1Label = new JLabel();
		player1Label.setText("Player1 Name :");
		player1Name = new JTextField();

		player2Label = new JLabel();
		player2Label.setText("Player2 Name :");
		player2Name = new JTextField();

		submit = new JButton("SUBMIT");

		panel = new JPanel(new GridLayout(3, 1, 15, 15));

		panel.add(player1Label);
		panel.add(player1Name);
		panel.add(player2Label);
		panel.add(player2Name);

		panel.add(submit);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		submit.addActionListener(new PlayerFrameListner(this));

		add(panel, BorderLayout.CENTER);
		setTitle("Please Enter Detail here !");
		setSize(500, 200);
		setVisible(true);

	}

	public static String getPlayer1Name() {
		return player1Name.getText();
	}

	public static String getPlayer2Name() {
		return player2Name.getText();
	}
}
