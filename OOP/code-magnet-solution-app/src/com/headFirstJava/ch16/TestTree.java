package com.headFirstJava.ch16;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTree implements Comparator<Book>{
	public static void main(String args[]) {
		new TestTree().go();
	}

	public void go() {
		Book b1 = new Book("How Cat Works");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");
		
		TreeSet<Book> tree = new TreeSet<Book>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);
	}

	@Override
	public int compare(Book o1, Book o2) {
		return o1.title.compareTo(o2.title);
	}
}

class Book implements Comparable{
	String title;

	public Book(String t) {
		title = t;
	}

	@Override
	public int compareTo(Object o) {
		Book b=(Book)o;
		return (title.compareTo(b.title));
	}
}