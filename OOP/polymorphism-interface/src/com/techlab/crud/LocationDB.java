package com.techlab.crud;

public class LocationDB implements Icrudable{

	@Override
	public void create() {
		System.out.println("Location table created");		
	}

	@Override
	public void read() {
		System.out.println("Location table data reading");		
	}

	@Override
	public void update() {
		System.out.println("Location table updating");
	}

	@Override
	public void delete() {
		System.out.println("Location table deleting");
	}
	
}
