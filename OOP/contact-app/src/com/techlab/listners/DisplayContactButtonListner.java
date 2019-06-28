package com.techlab.listners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;

import com.techlab.contact.Contact;
import com.techlab.contact.service.ContactService;
import com.techlab.frames.DisplayFrame;

public class DisplayContactButtonListner implements ActionListener{
	private ArrayList<Contact> contactList;
	private ContactService service;
	
	public DisplayContactButtonListner() {
		service = new ContactService();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		contactList = service.retriveContactsFromDisk();
		new DisplayFrame(contactList);
	}
}
