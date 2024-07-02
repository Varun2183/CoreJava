package com.tnsif.abstractprog;

public class Varun  extends TaxPayer{

	public Varun(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calltax() {
		// TODO Auto-generated method stub
		
		if(salary<500000) {
			return salary*0.10;
		}
		else {
			return salary*0.20;
		}
	}

}
