package com.techlab.student.tree.set.test;

import java.util.TreeSet;

import com.techlab.student.CgpiComparator;
import com.techlab.student.NameComparator;
import com.techlab.student.Student;

public class StudentTreeSetTest {
	public static void main(String args[]) {
		Student s1 = new Student("cvivek", 10, 15.0f, 11);
		Student s2 = new Student("bkaran", 1, 17.0f, 11);
		Student s3 = new Student("aparas", 20, 9.0f, 11);

		TreeSet<Student> nameCompTreeSet = new TreeSet<Student>(new NameComparator());
		nameCompTreeSet.add(s1);
		nameCompTreeSet.add(s2);
		nameCompTreeSet.add(s3);
		System.out.println("Sortedd by Name");
		for (Student s : nameCompTreeSet) {
			System.out.println("name : " + s.getName() + "\n" + "Roll number : " + s.getRollNumber());
		}

		System.out.println("***************");

		TreeSet<Student> cgpiCompTreeSet = new TreeSet<Student>(new CgpiComparator());
		cgpiCompTreeSet.add(s1);
		cgpiCompTreeSet.add(s2);
		cgpiCompTreeSet.add(s3);
		System.out.println("Sortedd by CGPI");
		for (Student s : cgpiCompTreeSet) {
			System.out.println("name : " + s.getName() + "\n" + "Roll number : " + s.getRollNumber() + "CGPI : " + s.getCgpi());
		}
	}
}
