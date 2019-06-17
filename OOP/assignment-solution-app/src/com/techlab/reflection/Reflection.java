package com.techlab.reflection;

import java.lang.reflect.*;

public class Reflection {
	private int numberOFMethods;
	private int numberOfConstructors;
	private int numberOfFields;
	private Method m[] = null;
	private Constructor c[];
	private Field f[];
	private String className;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public int getNumberOfMethods() {
		return this.numberOFMethods;
	}
	
	public int getNumbersOfField() {
		return this.numberOfFields;
	}
	
	public int getNumbersOfConstructor() {
		return this.numberOfConstructors;
	}
	public void findMethods() throws ClassNotFoundException {
		Class<?> c1 = getClassInstatce(this.className);
		Method m[] = c1.getMethods();
		this.m = m;
		this.numberOFMethods = m.length;
	}

	public void findConstructors() throws ClassNotFoundException {
		Class<?> c1 = getClassInstatce(this.className);
		Constructor<?> c[] = c1.getConstructors();
		this.c = c;
		this.numberOfConstructors = c.length;
	}

	public void findFields() throws ClassNotFoundException {
		Class<?> c1 = Class.forName(this.className);
		Field f[] = c1.getFields();
		this.f = f;
		this.numberOfFields = f.length;
	}

	private static Class<?> getClassInstatce(String className) throws ClassNotFoundException {
		Class<?> c1 = Class.forName(className);
		return c1;
	}
}
