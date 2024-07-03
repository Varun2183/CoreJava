package com.tnsif.interfaceprog;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amazon ob=new NonPrime();
		ob.welcome();
		ob.service_charge();
		ob.thankyou();
		
		Amazon ob1=new Prime();
		ob1.welcome();
		ob1.thankyou();
	}

}
