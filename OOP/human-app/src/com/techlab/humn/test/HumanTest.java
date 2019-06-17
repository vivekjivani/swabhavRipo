package com.techlab.humn.test;

import com.techlab.human.GenderType;
import com.techlab.human.Human;

public class HumanTest {
	public static void main(String args[]) {
			Human vivek=new Human("vivek", 21, 5.11f, 67.0f, GenderType.MALE);
			displayHumanStatus(vivek);
			vivek.eat();
			displayHumanStatus(vivek);
			vivek.workout();
			displayHumanStatus(vivek);
	}
	private static void displayHumanStatus(Human human) {
		System.out.println("Name : "+human.getName());
		System.out.println("Age : "+human.getAge());
		System.out.println("Height : "+human.getHeight());
		System.out.println("Weight : "+human.getWeigth());
		System.out.println("Gender : "+human.getGender());
		System.out.println("BMI : "+human.calculateBMI());
		System.out.println("BodyCategory : "+human.getBodyCategary()+"\n");
	}
}
