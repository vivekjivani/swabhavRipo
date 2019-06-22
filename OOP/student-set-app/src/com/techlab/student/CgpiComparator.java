package com.techlab.student;

import java.util.Comparator;

public class CgpiComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getCgpi() < s2.getCgpi())
			return -1;
		if (s1.getCgpi() > s2.getCgpi())
			return 1;

		return 0;
	}

}
