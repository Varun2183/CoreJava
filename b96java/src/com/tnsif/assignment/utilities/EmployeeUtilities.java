package com.tnsif.assignment.utilities;
import com.tnsif.assignment.employees.Employee;
import com.tnsif.assignment.employees.Manager;
import com.tnsif.assignment.employees.Developer;

public class EmployeeUtilities {

	public static void giveRaise(Employee employee, int raiseAmount) {
		int raise=(employee.getSalary() + raiseAmount);
        employee.setSalary(raise);
	}
	 public static void printEmployeeDetails(Employee employee) {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());

	        if (employee instanceof Manager) {
	            System.out.println("Team Size: " + ((Manager) employee).getTeamSize());
	        } else if (employee instanceof Developer) {
	            System.out.println("Programming Language: " + ((Developer) employee).getProgrammingLanguage());
	        }
	    }
}
