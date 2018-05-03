package com.philip;

import java.text.DecimalFormat;

public class PaddingNumbersInJava {

	public static void main(String[] args) {
		int quantity = 5;
		String padded = String.format("%04d", quantity);
		System.out.println("This number is padded with four zeros : " +padded);
		
		System.out.println("---------------------------------------------------------------");
		
		DecimalFormat df = new DecimalFormat("0000000000");
		Integer number = 45;
		String paddedString = df.format(number);
		System.out.println("The paddedString value is: "+paddedString);
		 
	}

}
