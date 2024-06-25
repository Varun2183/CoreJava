package com.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		Encapsulation ob= new Encapsulation();// object creation
	/*	ob.name="varun";//calling the variable
		ob.age=33;
		ob.serialNum=22; */
		
		
		ob.setAge(21);
		ob.setName("arun");
		ob.setSerialNum(2);
		System.out.println(ob);
		ob.show();
	}
}
