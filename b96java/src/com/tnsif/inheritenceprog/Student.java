package com.tnsif.inheritenceprog;

public class Student extends customer{

	private String collegename;
	private int rollno;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id, long aadharno, long phoneno, String collegename, int rollno) {
		super(name, id, aadharno, phoneno);
		// TODO Auto-generated constructor stub
		
		this.collegename=collegename;
		this.rollno=rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [collegename=" + collegename + ", rollno=" + rollno + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getAadharno()=" + getAadharno() + ", getPhoneno()=" + getPhoneno() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
