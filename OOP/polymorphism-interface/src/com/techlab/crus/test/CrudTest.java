package com.techlab.crus.test;

import com.techlab.crud.DepartmentDB;
import com.techlab.crud.EmployeeDB;
import com.techlab.crud.Icrudable;
import com.techlab.crud.LocationDB;

public class CrudTest {
	public static void main(String args[]) {
		doDBOperation(new LocationDB());
		doDBOperation(new DepartmentDB());
		doDBOperation(new EmployeeDB());
	}
	private static void doDBOperation(Icrudable x) {
		System.out.println(".......Doing DB Operation.........");
		x.create();
		x.delete();
		x.read();
		x.update();
	}
}
