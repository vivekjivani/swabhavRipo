package com.techlab.contact;

import java.io.Serializable;

public class Contact implements Serializable {
	private String name;
	private String email;
	private long phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	 @Override
	public String toString() {
		return name+"\t"+email+"\t"+phone;
	}
}
