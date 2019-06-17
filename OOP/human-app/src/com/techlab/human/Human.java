package com.techlab.human;

import java.io.Serializable;

public class Human implements Serializable{
	private String name;
	private int age;
	private float height;
	private float weight;
	private GenderType gender;
	private final static float HEIGHT_GAIN_PERSENTAGE = 0.5f;
	private final static float WEIGHT_GAIN_PERSENTAGE = 0.2f;
	private final static float WEIGHT_LOSS_PERSENTAGE = 0.1f;
	private static int counter = 0;

	public Human(String name, int age, float height, float weight, GenderType gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		counter++;
	}

	public Human(String name, int age) {
		this(name, age, 5.0f, 50.0f, GenderType.MALE);
	}

	public static int headCount() {
		return counter;
	}

	public String getName() {
		return this.name;
	}

	public float getAge() {
		return this.age;
	}

	public GenderType getGender() {
		return this.gender;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight() {
		return this.height;
	}

	public void setWeight(float weigth) {
		this.weight = weigth;
	}

	public float getWeigth() {
		return this.weight;
	}

	public void workout() {
		float weightLoss = WEIGHT_LOSS_PERSENTAGE * this.weight;
		this.weight -= weightLoss;
	}

	public void eat() {
		float heightIncrease = HEIGHT_GAIN_PERSENTAGE * this.height;
		this.height += heightIncrease;
		float weightGain = WEIGHT_GAIN_PERSENTAGE * this.height;
		this.weight += weightGain;
	}

	public float calculateBMI() {
		float heightInMeter = this.height * 0.3048f;
		float BMI = this.weight / (heightInMeter * heightInMeter);
		return BMI;
	}

	public String getBodyCategary() {
		float BMI = this.calculateBMI();
		final float underWeight = 18.5f;
		final float normalWeight = 24.9f;
		final float obesity = 29.9f;
		if (BMI < underWeight)
			return "Underweight";
		if (BMI > underWeight && BMI < normalWeight)
			return "Normalweight";
		if (BMI > normalWeight && BMI < obesity)
			return "Obesity";
		return "HightObesity";
	}

	public Human whoIsElder(Human obj) {
		if (this.age < obj.age)
			return obj;
		return this;
	}
}
