package com.techlab.frames;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.techlab.listners.AddContactButtonListner;
import com.techlab.listners.DisplayContactButtonListner;

public class WelcomeFrame extends JFrame{
	private JButton addContactButton;
	private JButton displayContactButton;
	private JLabel welcomeLabel;
	
	public WelcomeFrame() {
		addContactButton = new JButton("Add Contact");
		addContactButton.setBounds(10, 100, 200, 50);
		addContactButton.addActionListener(new AddContactButtonListner());
		this.add(addContactButton,BorderLayout.CENTER);
		
		displayContactButton = new JButton("Display Contact");
		displayContactButton.setBounds(220, 100, 200, 50);
		displayContactButton.addActionListener(new DisplayContactButtonListner());
		this.add(displayContactButton,BorderLayout.SOUTH);
		
		welcomeLabel = new JLabel("Contact App");
		welcomeLabel.setFont(new Font("Arial",Font.TRUETYPE_FONT,30));	
		welcomeLabel.setBounds(10, 10,200, 50);		
		this.add(welcomeLabel);
		
		this.setLayout(null);
		this.setSize(450, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
