package com.techlab.student;

public class Student implements Comparable<Student> {
	private String name;
	private int rollNumber;
	private float cgpi;
	private int standerd;

	public Student(String name, int rollNumber, float cgpi,int standerd) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.cgpi = cgpi;
		this.standerd = standerd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNumber;
		result = prime * result + standerd;
		//System.out.println(result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		if (rollNumber != other.rollNumber)
			return false;
		if (standerd != other.standerd)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public float getCgpi() {
		return cgpi;
	}

	@Override
	public int compareTo(Student o) {
		Student s = (Student) o;
		if(s.rollNumber < this.rollNumber)
			return 1;
		if(s.rollNumber > this.rollNumber)
			return -1;
		return 0;
	}	
	
	@Override
	public String toString() {
		return "{Name : "+this.name
				+", RollNumber : "+this.rollNumber
				+", Std : "+this.standerd
				+", CGPI : "+this.cgpi+"}";
	}
}
