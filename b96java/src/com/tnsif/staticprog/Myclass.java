package com.tnsif.staticprog;

public class Myclass {

	private int section;//instance
	static int srno;//static variable
	
	static {
		
		System.out.println("----Static Block----");
		srno=100;
		
	}

	public Myclass() {
		super();
		System.out.println("----Default constructor----");
		
	}
	
	static void display() {
		
		System.out.println("----Static method----");
		System.out.println("the Serial no is "+ srno++);
	}

	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
}
