package com.techlab.listner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlertButtonListner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Alert!!");
	}

}
