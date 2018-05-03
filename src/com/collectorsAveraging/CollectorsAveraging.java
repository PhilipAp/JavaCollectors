package com.collectorsAveraging;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAveraging {

	public static void main(String[] args) {

		List<Employee> employeeList
	      = Arrays.asList(new Employee("Tom Jones", 45, 15000.00,190),
	      new Employee("Tom Jones", 45, 7000.00,220),
	      new Employee("Ethan Hardy", 65, 8000.00,1008),
	      new Employee("Nancy Smith", 22, 10000.00,5),
	      new Employee("Deborah Sprightly", 29, 9000.00,45));
		
		//Using Collectors.averagingInt()
	    Double avgAge = employeeList
	        .stream()
	        .collect(Collectors.averagingInt(Employee::getAge));
	     System.out.println("Average age using Collectors.averagingInt: " + avgAge);
	 
	    //Using Collectors.averagingLong()
	    Double avgLeaves = employeeList
	        .stream()
	        .collect(Collectors.averagingLong(Employee::getLeaves));
	    System.out.println("Average leaves using Collectors.averagingLong: " + avgLeaves);
	 
	    //Using Collectors.averagingDouble()
	    Double avgSalary = employeeList
	        .stream()
	        .collect(Collectors.averagingDouble(Employee::getSalary));
	    System.out.println("Average salary using Collectors.averagingDouble: " + avgSalary);
	}

}
