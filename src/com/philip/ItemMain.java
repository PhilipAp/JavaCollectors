package com.philip;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemMain {

	public static void main(String[] args) {
		List<Item> items = Arrays.asList(
				new Item("Banana", 23, new BigDecimal("99.32")),
				new Item("Orange", 45, new BigDecimal("78.61")),
				new Item("Apple", 20, new BigDecimal("30.32")),
				new Item("Watermelon", 19, new BigDecimal("99.32")),
				new Item("Guava", 61, new BigDecimal("140.32")),
				new Item("Kiwi", 32, new BigDecimal("32.12")),
				new Item("Strawberry", 21, new BigDecimal("41.20")),
				new Item("Cherry", 71, new BigDecimal("78.61")));
		
		//group by price
        
			Map<BigDecimal, List<Item>> groupByPriceMap = items.stream()
					                                           .collect(Collectors.groupingBy(Item::getPrice));
        System.out.println(groupByPriceMap);
        
        System.out.println("---------------------------------------------");

		// group by price, uses 'mapping' to convert List<Item> to Set<String>
        Map<BigDecimal, Set<String>> result = items.stream()
                                                   .collect(
                                                    Collectors.groupingBy(Item::getPrice,
                                                    Collectors.mapping(Item::getName, Collectors.toSet())
                        )
                );
        System.out.println(result);

    }
}
