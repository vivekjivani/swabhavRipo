package com.techlab.subject;

import com.techlab.observer.Observer;

public interface Subject {
	void addObserver(Observer object);
	void removeObserver(Observer object);
	void notifyObserver();
}
