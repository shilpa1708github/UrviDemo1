package com.demo2;

public class Student1 {

	int id;
	String name;
	String city;
	int marks;

	public Student1(int id, String name, String city, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

}
