package com.techlab.circleTest;

import com.tachlab.circle.BorderColor;
import com.tachlab.circle.Circle;

public class CircleTest {
	public static void main(String args[]) {
		Circle[] circleArray = new Circle[5];
		for (int i = 0; i < 5; i++) {
			circleArray[i] = new Circle();
		}
		circleArray[0].setRadius(10.0f);
		circleArray[1].setRadius(20.0f);
		circleArray[2].setRadius(5.0f);
		circleArray[3].setRadius(15.0f);
		circleArray[4].setRadius(25.0f);

		circleArray[0].setBorder(BorderColor.BLUE);
		circleArray[1].setBorder(BorderColor.GREEN);
		circleArray[2].setBorder(BorderColor.RED);
		circleArray[3].setBorder(BorderColor.BLUE);
		circleArray[4].setBorder(BorderColor.GREEN);
		
		displayArea(circleArray);
		calculateSumOfTotalArea(circleArray);
		
	}

	private static void calculateSumOfTotalArea(Circle[] circleArray) {
		float sum = 0.0f;
		for (Circle c : circleArray) {
			sum += c.getArea();
		}
		System.out.println("Sum of All circle's area is = " + sum);
	}

	private static void displayArea(Circle[] circleArray) {
		for(Circle c:circleArray) {
			System.out.println("radius : "+c.getRadius());
			System.out.println("BorderColor : "+c.getBorder());
			System.out.println("Area : "+c.getArea()+"\n");
		}
	}
}