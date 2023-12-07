package com.bee.teach.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(6, 5, 4, 2, 3, 1);
		
		Stream<Integer> data = numbers.stream();
		
		// TODO The moment you use stream once you can't reuse it
		
		//Stream<Integer> sortedData = data.sorted();
		
		// TODO Double the value and print
		Stream<Integer> mappedData = data.map(n -> n*2);
		
		//mappedData.forEach(n -> System.out.println(n));
		
		// TODO Demo the object of Predicate
		
		// TODO Declarative style
		numbers.stream()
			.filter(n -> n%2 == 1) // Double the value when the value is odd
			.sorted()
			.map(n -> n*2)
			.forEach(n -> System.out.println(n));
		
		// TODO Demo reduce function
		//System.out.println(result);
		
	}

}
