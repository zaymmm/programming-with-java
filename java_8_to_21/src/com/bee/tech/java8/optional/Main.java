package com.bee.tech.java8.optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		Dog myDog = Dog.findDogByName("Joe");
		
		Optional<Dog> optionalDog = Dog.findDogByNameOptional("Joe");
		
		if(optionalDog.isPresent()) {
			System.out.println("Optional Dog: " + optionalDog.get().getName());
		}else {
			System.out.println("Optional Dog: Null");
		}

		optionalDog.map(Dog::getName)
		.orElse("Alex");
		System.out.println("Optional Dog: " + optionalDog.get().getName());

	}

	private static class Dog {

		private String name;

		private int age;

		public Dog(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public static Dog findDogByName(String name) {
			Dog dog = new Dog("Joe", 4);
			return dog;
		}
		
		public static Optional<Dog> findDogByNameOptional(String name){
			// return Optional.of(null);
			return Optional.ofNullable(new Dog("Joe", 3));
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}

}
