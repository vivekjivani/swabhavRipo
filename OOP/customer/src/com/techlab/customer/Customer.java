package com.techlab.customer;

public class Customer {
	private int id;
	private String firstname;
	private String lastname;
	private static int NEXT_ID=1000;
		
	public Customer(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.id=++NEXT_ID;	
	}
	public Customer() {
		this("","");
	}
	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	public int getId() {
		return this.id;
	}
	public void displayCustomerDetail() {
		System.out.println("id : "+this.getId()+" name : "+this.getFirstName());
	}

}
