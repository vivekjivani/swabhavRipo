package com.techlab.contactConsoul;

import java.util.Scanner;

import com.techlab.contact.service.ContactService;

public class ConatctConsole {
	ContactService service;

	public ConatctConsole() {
		service = new ContactService();
	}

	public void start() {
		while (true) {
			System.out.println("1. Save Contact");
			System.out.println("2. Display Conatct");
			System.out.println("3. Exit");
			System.out.println("Enetr your choice : ");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			if (choice >= 3) {
				break;
			}
			if (choice == 1) {

				System.out.println("Enter Name : ");
				String name = scanner.next();
				// System.out.println(name);
				System.out.println("Enetr email : ");
				String email = scanner.next();
				// System.out.println(email);
				System.out.println("Enter Phone Number : ");
				Long phone = scanner.nextLong();
				// System.out.println(phone);
				service.saveContact(name, email, phone);
			}
			if (choice == 2) {
				service.displayContact();
			}
		}
	}
	
	public static void main(String args[]) {
		new ConatctConsole().start();
	}
}
