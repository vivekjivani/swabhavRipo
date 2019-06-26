package com.techlab.subject;

import java.util.ArrayList;

import com.techlab.observer.Observer;

public class Loan implements Subject {
	private ArrayList<Observer> listOfObserver;
	private float interest;
	private String bankName;
	private String type;
	
	public Loan() {
		listOfObserver = new ArrayList<Observer>();
	}
	
	
	public Loan(float interest, String bankName, String type) {
		this();
		this.interest = interest;
		this.bankName = bankName;
		this.type = type;
	}


	public float getInterest() {
		return interest;
	}


	public void setInterest(float interest) {
		this.interest = interest;
		notifyObserver();
	}


	public String getBankName() {
		return bankName;
	}


	public String getType() {
		return type;
	}


	@Override
	public void addObserver(Observer observer) {
		listOfObserver.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		listOfObserver.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : listOfObserver) {
			observer.update(interest);
		}
	}

}
