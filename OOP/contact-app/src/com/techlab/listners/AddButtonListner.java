package com.techlab.listners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.techlab.contact.service.ContactService;
import com.techlab.frames.AddContactFrame;

public class AddButtonListner implements ActionListener {
	private AddContactFrame frame;
	private ContactService services;
	public AddButtonListner(AddContactFrame fram) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = frame.getNameField();
		String email = frame.getEmailField();
		Long phone = Long.parseLong(frame.getPhoneField());
		
		services = new ContactService();
		services.saveContact(name, email, phone);
		JOptionPane.showMessageDialog(frame,"Contact Added"); 
		
	}

}
