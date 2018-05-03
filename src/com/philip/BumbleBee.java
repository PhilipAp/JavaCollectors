package com.philip;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class BumbleBee {

	public static void main(String[] args) {
		Integer value1 = null;
		Integer value2 = new Integer(10);
		Optional<Integer> valueOne = Optional.ofNullable(value1);
		Optional<Integer> valueTwo = Optional.of(value2);
		Integer totalValue = sum(valueOne, valueTwo);
		System.out.println(totalValue);
		
		System.out.println("------------------------------------");
		
		List<String> hospitalNames = new ArrayList<>();
		hospitalNames.add("Nyaho clinic");
		hospitalNames.add("Roman Ridge Hospital");
		hospitalNames.add("Airport Women Hospital");
		hospitalNames.add("Petronia City Hospital");
		hospitalNames.add("Apolonia City Hospital");
		hospitalNames.add("Lusaka Avenue Clinic");
		hospitalNames.add("SuperTech Software Asylum");
		
		for(String names:hospitalNames) {
			System.out.println(names);			
		}
		
		System.out.println("------------------------------------");
		
		
		Stream<String> revampedHospitals = hospitalNames.parallelStream();
		               revampedHospitals.filter(s -> s.contains("Asylum"))
		                                .forEach(System.out::println);
		               
	    System.out.println("------------------------------------");
	    
	    StringBuilder credentialCode = new StringBuilder(20);
	    credentialCode.append("ama")
	                  .append("-")
	                  .append("yoofi")
	                  .append("-")
	                  .append("but maame could be late for the meeting on")
	                  .append("-")
	                  .append(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
	    System.out.println(credentialCode);
	    
	    LocalDate fromDate = LocalDate.now().minusMonths(3).minusDays(1);
	    System.out.println("This one " +fromDate);
		 
	}

	private static Integer sum(Optional<Integer> valueOne, Optional<Integer> valueTwo) {
		System.out.println("First parameter is : "+ valueOne.isPresent());
		System.out.println("Second parameter is : "+ valueTwo.isPresent());
		
		Integer value1 = valueOne.orElse(new Integer(0));
		Integer value2= valueTwo.get();		
		return value1+value2;
	}
	
}
