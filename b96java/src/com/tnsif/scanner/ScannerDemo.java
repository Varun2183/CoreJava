package com.tnsif.scanner;

import java.util.Scanner;

public class ScannerDemo {

public static void main(String[] args) {
		
		Scanner ob1 = new Scanner(System.in);
		System.out.println("Enter the id : ");
		int id=ob1.nextInt();
		System.out.println("Enter the Name");
		String name=ob1.nextLine();
		System.out.println("Enter the initial");
		char a=ob1.next().charAt(0);
		
	}
}
