package com.techlab.move.test;

import com.techlab.move.Bike;
import com.techlab.move.Car;
import com.techlab.move.Imoveable;
import com.techlab.move.Truck;

public class MoveTest {
	public static void main(String args[]) {
		Imoveable[] array=new Imoveable[3];
		array[0]=new Truck();
		array[1]=new Car();
		array[2]=new Bike();
		startRace(array);
	}
	private static void startRace(Imoveable[] array) {
		for(Imoveable x : array) {
			x.move();
		}
	}
}
