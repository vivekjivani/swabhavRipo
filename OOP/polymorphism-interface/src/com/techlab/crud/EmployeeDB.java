package com.techlab.crud;

public class EmployeeDB implements Icrudable{
	@Override
	public void create() {
		System.out.println("Employee table created");		
	}

	@Override
	public void read() {
		System.out.println("Employee table data reading");		
	}

	@Override
	public void update() {
		System.out.println("Employee table updating");
	}

	@Override
	public void delete() {
		System.out.println("Employee table deleting");
	}
}
