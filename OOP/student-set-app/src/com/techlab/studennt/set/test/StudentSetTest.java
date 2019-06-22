package com.techlab.studennt.set.test;

import java.util.TreeSet;

import com.techlab.student.NameComparator;
import com.techlab.student.Student;

public class StudentSetTest {

	public static void main(String args[]) {
		Student student1 = new Student("vivek", 1, 7.8f,2);
		Student student2 = new Student("vivek", 1, 7.8f,2);
		Student student3 = new Student("vivek", 1, 7.8f,2);

		TreeSet<Student> studentSet = new TreeSet<Student>(new NameComparator());
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		
		System.out.println("Size of set is : " + studentSet.size());
	}
}
