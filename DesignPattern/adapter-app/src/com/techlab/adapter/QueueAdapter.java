package com.techlab.adapter;

import java.util.Iterator;

import com.techlab.iqueue.IQueue;
import com.techlab.linkedlist.MyLinkedList;

public class QueueAdapter<T> implements IQueue<T> {

	private MyLinkedList<T> linkedList;

	public QueueAdapter(MyLinkedList<T> linkedList) {
		this.linkedList = linkedList;
	}

	@Override
	public void enQueue(T element) {
		linkedList.addLast(element);
	}

	@Override
	public T deQueue() {
		return linkedList.removeFirst();
	}

	@Override
	public int count() {
		return linkedList.getSize();
	}

	@Override
	public Iterator<T> iterator() {
		return linkedList.iterator();
	}

}
