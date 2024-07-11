package com.tnsif.ecxeption;

public class Nestedtry {

	public static void check() {
		String str="tns";
		int arr[]=null;
		int y=6;
		try {//outer try block
			int z=y/0;
			try {//inner try block
				System.out.println(arr[0]);
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Exception handeled"+e.getMessage());
			}
			catch(NullPointerException e) {
				System.out.println("Exception handeled"+e.getMessage());
			}
		}
		catch(ArithmeticException e ) {
			System.out.println("Exception handeled"+e.getMessage());
		}
	}
}
