package com.mm.bee.tech;

public class TernaryOperators {

	public static void main(String[] args) {
		// if else short form

		int n = 10;
		int result = 0;

//		if (n % 2 == 0) {
//			result = 0;
//		} else {
//			result = -0;
//		}

		result = n % 2 == 0 ? 0 : -0; // <condition> ? <result> : <result>
		System.out.println("Result : " + result);
		
		
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		
		int result1 = a > b ? 1 : b > c ? 2 : 3 ;
		System.out.println("Result  : " + result1);
		
	}

}
