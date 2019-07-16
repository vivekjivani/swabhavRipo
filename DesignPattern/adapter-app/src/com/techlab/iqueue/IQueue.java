package com.techlab.iqueue;

public interface IQueue<T> extends Iterable<T> {
	public void enQueue(T element);

	public T deQueue();

	public int count();
}
