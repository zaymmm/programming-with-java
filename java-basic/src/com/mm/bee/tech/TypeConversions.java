package com.mm.bee.tech;

public class TypeConversions {
	public static void main(String[] args) {
		
		byte a = 10;
		int b = 100;
		
		a = (byte) b; // type casting
		b = a; // type conversion
		
		byte c = 20;
		byte d = 30;
		
		int result = 20 * 30; // type promotion
		System.out.println("Result : " + result);
		
		
	}

}
