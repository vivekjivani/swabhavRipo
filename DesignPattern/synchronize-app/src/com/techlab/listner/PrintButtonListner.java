package com.techlab.listner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PrintButtonListner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Date date = new Date();
		for(;;) {
			System.out.println(date.getTime());
		}
	}

}
