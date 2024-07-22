package com.tnsif.lamdaexp;

import java.util.ArrayList;
public class LamdaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> li=new ArrayList<>();
		li.add(22);
		li.add(36);
		li.add(50);
		li.forEach(e->System.out.println(e));
	}
}
