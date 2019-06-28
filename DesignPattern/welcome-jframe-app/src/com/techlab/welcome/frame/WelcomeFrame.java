package com.techlab.welcome.frame;

import java.awt.Color;

import javax.swing.JFrame;

public class WelcomeFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public WelcomeFrame() {
	}

	public WelcomeFrame(String title) {
		super(title);
	}

	public WelcomeFrame(String title, int width, int height) {
		this(title);
		this.setSize(width, height);
	}

	public WelcomeFrame(String title, int width, int height, Color bgColor) {
		this(title, width, height);
		this.getContentPane().setBackground(bgColor);
		this.setVisible(true);
		this.setLayout(null);

	}

	protected void frameInit() {
		super.frameInit();
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
}
