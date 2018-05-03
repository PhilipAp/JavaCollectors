package com.collectorsMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMapping {

	public static void main(String[] args) {
		
		List<Employee> employeeList
	      = Arrays.asList(new Employee("Tom Jones", 45, 15000.00),
	      new Employee("Harry Andrews", 45, 7000.00),
	      new Employee("Ethan Hardy", 65, 8000.00),
	      new Employee("Nancy Smith", 22, 10000.00),
	      new Employee("Deborah Sprightly", 29, 9000.00));
	 
	 
	    List<String> employeeNames = employeeList
	        .stream()
	        .collect(Collectors.mapping(Employee::getName, Collectors.toList()));
	    System.out.println("List of employee names:" + employeeNames);
	    
	    System.out.println("--------------------------------");
	    
	    Optional<Integer> maxAge = employeeList
	    	      .stream()
	    	      .collect(Collectors.mapping((Employee emp) -> emp.getAge(), Collectors.maxBy(Integer::compareTo)));
	    	  System.out.println("Max Age: " + maxAge.get());
	  
	}

}
