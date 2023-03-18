package com.mm.bee.tech;

public class StringDemo {
	
	public static void main(String[] args) {
		// create String
		
		String text1 = "Hello World";
		
		System.out.println(text1);

		String text2 = new String("Hello World");
		System.out.println(text2);
		
		
		System.out.println(text1.equals(text2));
		
		System.out.println(text2.toUpperCase());
		System.out.println(text2.toLowerCase());
		
		System.out.println(text1.concat(text2));
		System.out.println(text1.substring(0, 5));
		
		String name = "Alex Zay Zay";
		name = name.replaceAll(" ", "_");
		System.out.println("Name : " + name);
		
		name = "   Alex Zay   ";
		System.out.println("Name : " + name.trim());
		
		String address = "no.10, rose street";
		
		String [] testArray = address.split(",");
		System.out.println(testArray[0]);
		System.out.println(testArray[1].trim());
		
		
	}

}
