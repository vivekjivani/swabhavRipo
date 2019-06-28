package com.techlab.contact.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import com.techlab.contact.Contact;

public class ContactService {
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
	private Contact contact;

	public ContactService() {

	}

	public void saveContact(String name, String email, long phone) {
		contactList = retriveContactsFromDisk();
		contact = new Contact();
		contact.setName(name);
		contact.setEmail(email);
		contact.setPhone(phone);
		contactList.add(contact);
		storeContatcsToDisk();
	}

	public void storeContatcsToDisk() {
		try {
			FileOutputStream file = new FileOutputStream("res/Contact.dat");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(contactList);
			out.close();
			file.close();
			//System.out.println("Data Stored");
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

	public ArrayList<Contact> retriveContactsFromDisk() {
		try {
			FileInputStream file = new FileInputStream("res/Contact.dat");
			ObjectInputStream in = new ObjectInputStream(file);
			contactList = (ArrayList<Contact>) in.readObject();
			in.close();
			file.close();
		} catch (IOException ex) {
			System.out.println("IOException");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return contactList;
	}

	public void displayContact() {
		ArrayList<Contact> contactList = retriveContactsFromDisk();
		for (Contact c : contactList) {
			System.out.println(c.getName() + "  " + c.getPhone() + " " + c.getEmail());
		}
	}
}
