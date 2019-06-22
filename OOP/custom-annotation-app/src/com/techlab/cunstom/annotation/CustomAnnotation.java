package com.techlab.cunstom.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;

import com.techlab.custom.annotation.test.SampleClass;

public class CustomAnnotation {
	private static int COUNT_ANNOTATION;
	private ArrayList<String> requiredRefectorMethods;
	
	public CustomAnnotation() {
		requiredRefectorMethods = new ArrayList<String>();
	}
	
	public ArrayList<String> GetAnotatedMethod() {
		SampleClass sampleClassObj = new SampleClass();
		Class<SampleClass> className = (Class<SampleClass>) sampleClassObj.getClass();
		Method[] allMethods = className.getMethods();
		for(Method m : allMethods) {
			if(m.getAnnotation(RequiredRefector.class) != null) {
				requiredRefectorMethods.add(m.getName());
				COUNT_ANNOTATION++;
			}
		}
		return requiredRefectorMethods;
	}
	
	public int getNumberOfRequiredRefectorMethod() {
		return COUNT_ANNOTATION;
	}
}
