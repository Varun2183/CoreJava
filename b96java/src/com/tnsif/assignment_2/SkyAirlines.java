package com.tnsif.assignment_2;
import java.util.Scanner;

class Customer {
    private String name;
    private String source;
    private String destination;

    // Constructor
    public Customer(String name, String source, String destination) {
        this.name = name;
        this.source = source;
        this.destination = destination;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
}

public class SkyAirlines {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting inputs from the user
        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        System.out.println("Enter source:");
        String source = scanner.nextLine();
        System.out.println("Enter destination:");
        String destination = scanner.nextLine();

        // Creating a Customer object
        Customer customer = new Customer(name, source, destination);

        // Printing the formatted message
        System.out.println("Dear " + customer.getName() + ",");
        System.out.println("Thank you for booking your flight with Sky Airlines.");
        System.out.println("You are flying from " + customer.getSource() + " to " + customer.getDestination() + ".");
    }
}
