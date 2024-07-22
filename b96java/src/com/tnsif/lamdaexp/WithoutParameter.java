package com.tnsif.lamdaexp;

public class WithoutParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Message m=()->{return "hrllo";};
		//System.out.println(m.greet());
		
		Cube c=(a)->{return a*a*a;};
		System.out.println(c.call(5));
	}

}
