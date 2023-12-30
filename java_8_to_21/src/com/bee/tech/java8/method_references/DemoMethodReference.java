package com.bee.tech.java8.method_references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    static void printStatic(String message) {
        System.out.println("Static: " + message);
    }

    void printInstance(String message) {
        System.out.println(name + ": " + message);
    }

	public String getName() {
		return name;
	}
    
    
}

public class DemoMethodReference {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Static Method Reference
        names.forEach(Person::printStatic);

        // Instance Method Reference of a Particular Object
        Person person = new Person("John");
        names.forEach(person::printInstance);

        // Instance Method Reference of an Arbitrary Object of a Particular Type
        names.forEach(Person::printStatic);

        // Constructor Reference
        
        List<Person> listPerson = new ArrayList<>();
       
        
        List<Person> persons = Arrays.asList("Mike", "Jane", "Eve")
        		.stream()
        		.map(Person::new)
        		.toList();
        		
    }
}
