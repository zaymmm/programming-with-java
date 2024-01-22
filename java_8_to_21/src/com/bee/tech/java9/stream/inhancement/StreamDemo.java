package com.bee.tech.java9.stream.inhancement;

import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		
		Stream<Integer> numbers1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		// TODO Take While
		//numbers1.takeWhile(n ->  n < 4).forEach(System.out::println);
		// Output: 1, 2, 3
		
		// TODO Drop While
		Stream<Integer> numbers2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		//numbers2.dropWhile(n -> n < 4).forEach(System.out::println);
		// Output: 4, 5, 6, 7, 8, 9
		
		// TODO Iterate
		Stream.iterate(1, n -> n < 10, n -> n * 2).forEach(System.out::println);
		
		// TODO Stream.ofNullable
		
		// TODO Stream to Array Conversion
		
	}

}