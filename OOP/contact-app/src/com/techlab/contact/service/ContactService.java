package com.techlab.contact.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.techlab.contact.Contact;

public class ContactService {
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
	private Contact contact;

	public void saveContact(String name, String email, long phone) {
		contact = new Contact();
		contact.setName(name);
		contact.setEmail(email);
		contact.setPhone(phone);
		contactList.add(contact);
	}

	public void storeContatcs() {
		try {
			FileOutputStream file = new FileOutputStream("E:\\Contact.dat");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(contactList);
			out.close();
			file.close();
			System.out.println("Data Stored");
		} catch (IOException ex) {
			System.out.println("IOException");
		}
	}

	public void retriveContacts() {
		try {
			FileInputStream file = new FileInputStream("E:\\Contact.dat");
			ObjectInputStream in = new ObjectInputStream(file);
			contactList = (ArrayList<Contact>) in.readObject();
			in.close();
			file.close();
		} catch (IOException ex) {
			System.out.println("IOException");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
