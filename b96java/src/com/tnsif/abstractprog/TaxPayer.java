//program to demonstrate abstract class

package com.tnsif.abstractprog;
// non concrete class
public abstract class TaxPayer {

	protected double salary;
	
	public TaxPayer(double salary) { //parameterized constructor
		super();
		this.salary = salary;
	}
	
	public abstract double calltax();//abstract method
	
	public void display() { //non abstract method
		System.out.println("the tax payed is "+calltax());
		
	}
	
}
