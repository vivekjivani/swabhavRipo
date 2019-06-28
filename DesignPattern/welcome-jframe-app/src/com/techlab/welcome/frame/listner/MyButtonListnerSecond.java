package com.techlab.welcome.frame.listner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListnerSecond implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
				System.out.println("Second Listner Active: Hey You have Cliked Button");
	}
}
