package com.techlab.crud;

public class DepartmentDB implements Icrudable{
	@Override
	public void create() {
		System.out.println("Department table created");		
	}

	@Override
	public void read() {
		System.out.println("Department table data reading");		
	}

	@Override
	public void update() {
		System.out.println("Department table updating");
	}

	@Override
	public void delete() {
		System.out.println("Department table deleting");
	}
}
