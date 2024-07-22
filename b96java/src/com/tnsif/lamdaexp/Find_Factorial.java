package com.tnsif.lamdaexp;

import java.util.Scanner;

public class Find_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan=new Scanner (System.in); 
		 //create a scanner object 
		 System.out.println("Enter a number for find factorial");
		 int num=scan.nextInt();//get input from user 
		 factorial (num);//call the method 
	}

	 static void factorial (int num){//user defined method for calculate factorial 

		 int i, f = 1;
	        for (i = 1; i <= num; i++) {
	            f = f * i; // calculate the factorial using for loop
	        }
	        System.out.print("Factorial of the " + num + " is " + f);
	 }
  }

