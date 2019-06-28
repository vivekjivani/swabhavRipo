package com.techlab.welcome.frame.test;

import java.awt.Color;

import javax.swing.JButton;

import com.techlab.welcome.frame.WelcomeFrame;
import com.techlab.welcome.frame.listner.MyButtonListnerFirst;
import com.techlab.welcome.frame.listner.MyButtonListnerSecond;
import com.techlab.welcome.frame.listner.RedButtonBlueButtonCommonListner;

public class WelcomeFrameTest {
	public static void main(String args[]) {
		WelcomeFrame frame1 = new WelcomeFrame("frame1", 500, 300, Color.LIGHT_GRAY);

		JButton myButton = new JButton("Click me!!");
		myButton.addActionListener(new MyButtonListnerFirst());
		myButton.addActionListener(new MyButtonListnerSecond());
		myButton.setBounds(150, 50, 100, 40);
		frame1.add(myButton);

		WelcomeFrame frame2 = new WelcomeFrame("frame2", 500, 300, Color.LIGHT_GRAY);

		RedButtonBlueButtonCommonListner commanListner = new RedButtonBlueButtonCommonListner(frame2);

		JButton redButton = new JButton("Red");
		redButton.setName("Red");
		redButton.setBounds(150, 100, 100, 40);
		redButton.addActionListener(commanListner);
		frame2.add(redButton);

		JButton blueButton = new JButton("Blue");
		blueButton.setBounds(150, 150, 100, 40);
		blueButton.setName("Blue");
		blueButton.addActionListener(commanListner);
		frame2.add(blueButton);
	}
}
