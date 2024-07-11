package com.tnsif.ecxeption;

public class TryCatch {

	public static void divide() {
		// TODO Auto-generated method stub

		int a=6,b=0,c;
		
		try {
			c=a/b;//exception raised
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handeled"+e.getMessage());
		}
		catch(ArithmeticException e ) {
			System.out.println("Exception handeled"+e.getMessage());
		}
		catch(Exception e ) {
			System.out.println("Exception handeled"+e.getMessage());
		}
	}

}
