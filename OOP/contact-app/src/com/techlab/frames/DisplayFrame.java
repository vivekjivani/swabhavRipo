package com.techlab.frames;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.techlab.contact.Contact;

public class DisplayFrame extends JFrame {
	private ArrayList<Contact> contactList;
	private JLabel label;

	public DisplayFrame(ArrayList<Contact> contactList) {
		this.contactList = contactList;
		String col[] = { "Name", "Email", "Phone" };
		DefaultTableModel tableModel = new DefaultTableModel(0, col.length);
		tableModel.setColumnIdentifiers(col);
		JTable table = new JTable(tableModel);
		for (int i = 0; i < contactList.size(); i++) {
			String name = contactList.get(i).getName();
			String email = contactList.get(i).getEmail();
			long number = contactList.get(i).getPhone();

			Object[] data = { name, email, number };

			tableModel.addRow(data);
		}
		table.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(table);
		this.add(table);
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
