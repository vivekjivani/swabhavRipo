package com.techlab.listner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.techlab.child.threadClass.ChildThreadClass;

public class PrintButtonListner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		ChildThreadClass childThread = new ChildThreadClass();
		Thread thread = new Thread(childThread);
		thread.start();
	}

}
