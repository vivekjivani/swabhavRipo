package com.techlab.studenr.hash.map;

import java.util.HashMap;

import com.techlab.student.Student;

public class StudentHashMapTest {
	public static void main(String args[]) {
		HashMap<Student,Student> studentHashMap = new HashMap<Student, Student>();
		
		Student vivek1 = new Student("vivek", 21, 8.0f, 12);
		Student vivek2 = new Student("vivek", 21, 8.0f, 12);
		//Student hiren1 = new Student("hiren", 22, 9.0f, 12);
		//Student hiren2 = new Student("hiren", 22, 9.0f, 12);
		
		studentHashMap.put(vivek2, vivek2);
		studentHashMap.put(vivek1, vivek1);
		System.out.println(studentHashMap.size());
	}
}
