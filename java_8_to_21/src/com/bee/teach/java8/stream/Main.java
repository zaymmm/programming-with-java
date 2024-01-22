package com.bee.teach.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(6, 5, 4, 2, 3, 1);
		
		Stream<Integer> data = numbers.stream();
		
		// The moment you use stream once you can't reuse it
		
		Stream<Integer> sortedData = data.sorted();
		
		// Double the value and print
		Stream<Integer> mappedData = sortedData.map(n -> n*2);
		
		mappedData.forEach(n -> System.out.println(n));
		
		// Demo the object of Predicate
		
		// Declarative style
		numbers.stream()
			.filter(n -> n%2 == 1) // Double the value when the value is odd
			.sorted()
			.map(n -> n*2)
			.forEach(n -> System.out.println(n));
		
	}

}
