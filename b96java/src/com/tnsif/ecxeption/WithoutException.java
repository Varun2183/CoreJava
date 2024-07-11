package com.tnsif.ecxeption;

public class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d=0;
		try {
		int a=42/d;//exception raised
		System.out.println("varun");
		}
		
		catch(ArithmeticException e ) {
		System.out.println("exception habdeled successfully"+e.getMessage());
		}
		System.out.println("will not be printed");
	}

}
