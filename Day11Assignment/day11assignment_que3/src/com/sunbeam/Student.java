package com.sunbeam;

public class Student implements Comparable<Student> {
	
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Student() {
	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [ Roll No: "+this.roll+", Name: "+this.name+", City: "+this.city+", Marks: "+this.marks;
	}

	@Override
	public int compareTo(Student other) {
		int diff = this.roll - other.roll;
		return diff;
	}
	

}
