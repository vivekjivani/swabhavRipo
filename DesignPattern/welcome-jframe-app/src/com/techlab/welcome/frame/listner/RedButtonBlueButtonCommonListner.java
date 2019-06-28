package com.techlab.welcome.frame.listner;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.techlab.welcome.frame.WelcomeFrame;

public class RedButtonBlueButtonCommonListner implements ActionListener {
	private WelcomeFrame frame;

	public RedButtonBlueButtonCommonListner(WelcomeFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if (button.getName() == "Red")
			frame.getContentPane().setBackground(Color.red);
		if (button.getName() == "Blue")
			frame.getContentPane().setBackground(Color.blue);
	}

}