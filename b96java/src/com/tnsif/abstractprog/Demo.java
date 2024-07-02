package com.tnsif.abstractprog;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the salary of varun : ");
		double vsalary=sc.nextDouble();
		TaxPayer ob=new Varun( vsalary);
		
		System.out.println("enter the salary of arun : ");
		double asalary=sc.nextDouble();
		TaxPayer ob1=new Varun( asalary);
		
		System.out.println("salary of varun : ");
		ob.display();
		
		System.out.println("salary of arun : ");
		ob1.display();
	}
	
}
