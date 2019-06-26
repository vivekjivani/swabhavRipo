package com.techlab.app.layer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlab.business.layer.IAutomobile;
import com.techlab.business.layer.IAutomobileFactory;

public class AutomobileFactoryTest {

	public static void main(String args[]) throws IOException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		InputStream input = new FileInputStream("res/factory.property");
		
		Properties property = new Properties();
		
		property.load(input);
		
		String currentFactory = property.getProperty("current.factory");
		
		Class<?> classNoparams[] = {};
		Object ObjectNoparams[] = {};
		
		Class<?> c = Class.forName(currentFactory);

		Method m = c.getDeclaredMethod("getInstance", classNoparams);

		IAutomobileFactory fectory = (IAutomobileFactory) m.invoke(null, ObjectNoparams);

		IAutomobile auto = fectory.manufacturing();

		auto.start();
		auto.stop();
	}
}
