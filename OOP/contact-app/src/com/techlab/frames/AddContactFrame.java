package com.techlab.frames;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.techlab.listners.AddButtonListner;

public class AddContactFrame extends JFrame {
	private JLabel nameLabel, emailLabel, phoneLabel;
	private static JTextField nameField, emailField, phoneField;
	private JButton addButton;

	public AddContactFrame() {
		nameLabel = new JLabel("Name : ");
		nameLabel.setBounds(10, 10, 60, 60);
		this.add(nameLabel);
		
		emailLabel = new JLabel("Email : ");
		emailLabel.setBounds(10, 40, 60, 60);
		this.add(emailLabel);
		
		phoneLabel = new JLabel("Phone : ");
		phoneLabel.setBounds(10, 75, 60, 60);
		this.add(phoneLabel);
		
		nameField = new JTextField();
		nameField.setBounds(70, 30, 150, 25);
		this.add(nameField);
		
		emailField = new JTextField();
		emailField.setBounds(70, 60, 150, 25);
		this.add(emailField);
		
		phoneField = new JTextField();
		phoneField.setBounds(70, 90, 150, 25);
		this.add(phoneField);
		
		addButton = new JButton("Add");
		addButton.setBounds(10, 130, 100, 20);
		addButton.addActionListener(new AddButtonListner(this));
		this.add(addButton);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(270, 240);
		this.setLayout(null);
		this.setVisible(true);

	}

	public static String getNameField() {
		return nameField.getText();
	}

	public static String getEmailField() {
		return emailField.getText();
	}

	public static String getPhoneField() {
		return phoneField.getText();
	}
	
	
}
