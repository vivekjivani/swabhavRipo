package com.techlab.man.test;

import com.techlab.man.*;

public class MenTest {

	public static void main(String[] args) {
		//case1();
		//case2();
		//case3();
		//case4();
		case5();
	}

	public static void case1() {
		Man x;
		x = new Man();
		x.play();
		x.walk();
	}

	public static void case2() {
		Boy y;
		y = new Boy();
		y.play();
		y.eat();
		y.talk();
	}

	public static void case3() {
		Man x;
		x = new Boy();
		x.play();
		x.walk();
	}

	public static void case4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Todler());
	}

	public static void atThePark(Man x) {
		System.out.println("at the park..");
		x.play();
	}

	public static void case5() {
		Object x;
		//autoBoxing
		x = 10;
		x = "vivek";
		x = new Man();
		x = true;
	}
}
