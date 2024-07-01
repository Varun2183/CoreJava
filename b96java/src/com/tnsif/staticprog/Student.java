package com.tnsif.staticprog;

public class Student {

	private String name;//instance variable
	private int id;
	
	static String collageName="DBIT";//static variable

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}	
}
