package com.tnsif.abstractprog;

public class Arun extends TaxPayer {

	public Arun(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calltax() {
		// TODO Auto-generated method stub
		return salary*0.15;
	}

	
}
