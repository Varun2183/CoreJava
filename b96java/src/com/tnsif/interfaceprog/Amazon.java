//program to demonstrate interface
package com.tnsif.interfaceprog;

public interface Amazon {

	void welcome();
	void thankyou();
	
	default void service_charge() {
	
		int amt=100;
		System.out.println("the service charge is : "+ amt); 
		
	}
	default void aboutus() {
		System.out.println("this is an e-commerce website");
	}
	
}
