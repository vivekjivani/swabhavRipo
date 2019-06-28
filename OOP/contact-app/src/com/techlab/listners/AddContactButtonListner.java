package com.techlab.listners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.techlab.frames.AddContactFrame;

public class AddContactButtonListner implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		new AddContactFrame();
	}

}
