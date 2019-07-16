package com.techlab.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<T> {
	private java.util.LinkedList<T> linkedList;

	public MyLinkedList() {
		linkedList = new LinkedList<T>();
	}

	public void addLast(T item) {
		linkedList.addLast(item);
	}

	public void addFirst(T item) {
		linkedList.addFirst(item);
	}

	public T removeFirst() {
		return linkedList.removeFirst();
	}

	public T removeLast() {
		return linkedList.removeLast();
	}
	
	public int getSize() {
		return linkedList.size();
	}

	public Iterator<T> iterator() {
		return linkedList.iterator();
	}
}
