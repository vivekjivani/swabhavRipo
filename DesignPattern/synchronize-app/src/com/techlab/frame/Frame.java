package com.techlab.frame;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.techlab.listner.AlertButtonListner;
import com.techlab.listner.PrintButtonListner;

public class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 300;
	private JButton printButton, alertButton;

	public Frame() {
		printButton = new JButton("Print");
		alertButton = new JButton("Alert");

		printButton.setBounds(20, 50, 100, 20);
		alertButton.setBounds(130, 50, 100, 20);
		
		printButton.addActionListener(new PrintButtonListner());
		alertButton.addActionListener(new AlertButtonListner());

		this.add(printButton);
		this.add(alertButton);
		this.setLayout(null);

		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}
}
