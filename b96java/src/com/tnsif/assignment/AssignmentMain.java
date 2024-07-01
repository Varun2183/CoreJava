package com.tnsif.assignment;

import com.tnsif.assignment.employees.Manager;
import com.tnsif.assignment.employees.Developer;
import com.tnsif.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Manager manager = new Manager();
	        manager.setName("Alice");
	        manager.setEmployeeId(1);
	        manager.setSalary(80000);
	        manager.setTeamSize(10);

	        Developer developer = new Developer();
	        developer.setName("Bob");
	        developer.setEmployeeId(2);
	        developer.setSalary(60000);
	        developer.setProgrammingLanguage("Java");

	        EmployeeUtilities.printEmployeeDetails(manager);
	        EmployeeUtilities.printEmployeeDetails(developer);

	        EmployeeUtilities.giveRaise(manager, 5000);
	        EmployeeUtilities.giveRaise(developer, 3000);

	        System.out.println("\nAfter raise:");
	        EmployeeUtilities.printEmployeeDetails(manager);
	        EmployeeUtilities.printEmployeeDetails(developer);
		}

	}

