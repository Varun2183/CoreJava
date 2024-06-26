package com.tnsif.assignment_3;
import java.util.Scanner;

public class Commission {

	 private String name;
	    private String address;
	    private String phone;
	    private double salesAmount;
	    private double commission;

	    // Method to accept details of the sales employee
	    public void acceptDetails() {
	        Scanner in = new Scanner(System.in);

	        System.out.println("Enter name:");
	        name = in.nextLine();
	        System.out.println("Enter address:");
	        address = in.nextLine();
	        System.out.println("Enter phone:");
	        phone = in.nextLine();
	        System.out.println("Enter sales amount:");
	        salesAmount = in.nextDouble();
	    }

	    // Method to calculate the commission
	    public void calculateCommission() {
	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10;
	        } 
	        else if (salesAmount >= 50000) {
	            commission = salesAmount * 0.05;
	        } 
	        else if (salesAmount >= 30000) {
	            commission = salesAmount * 0.03;
	        } 
	        else {
	            commission = 0;
	        }
	    }

	    // Method to display the details and commission
	    public void displayDetails() {
	        System.out.println("Sales Employee Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Address: " + address);
	        System.out.println("Phone: " + phone);
	        System.out.println("Sales Amount: " + salesAmount);
	        System.out.println("Commission: " + commission);
	    }

	    public static void main(String[] args) {
	        // Creating an object of Commission class
	        Commission commissionObj = new Commission();

	        // Accepting details of the sales employee
	        commissionObj.acceptDetails();

	        // Calculating the commission
	        commissionObj.calculateCommission();

	        // Displaying the details and commission
	        commissionObj.displayDetails();
	    }
}
