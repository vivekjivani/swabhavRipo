package com.techlab.queue.adapter.test;

import com.techlab.adapter.QueueAdapter;
import com.techlab.iqueue.IQueue;
import com.techlab.linkedlist.MyLinkedList;

public class QueueAdapterTest {
	public static void main(String args[]) {
		MyLinkedList<String> linkedList = new MyLinkedList<String>();

		IQueue<String> stringQueue = new QueueAdapter<String>(linkedList);

		// case1
		stringQueue.enQueue("vivek");
		stringQueue.enQueue("darshan");
		stringQueue.enQueue("hiren");

		System.out.println("Count : " + stringQueue.count());

		System.out.println(stringQueue.deQueue());
		System.out.println(stringQueue.deQueue());
		System.out.println(stringQueue.deQueue());

		System.out.println("Count : " + stringQueue.count());

		// case2
		stringQueue.enQueue("vivek");
		stringQueue.enQueue("darshan");
		stringQueue.enQueue("hiren");

		System.out.println("**********");
		for (String s : stringQueue) {
			System.out.println(s);
		}
	}
}
