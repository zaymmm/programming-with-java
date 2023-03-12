package com.mm.bee.tech;

public class DataTypes {
	public static void main(String[] args) {
		/*
		- Integer -> byte, short, int, long
		- Float -> double, float
		- Character -> char, UNICODE
		- Boolean -> true, false
		*/
		
		// char test
		char a = 'A';
		System.out.println(a);
		
		char c = 'C';

		char tab = '\t';

		char A = '\u0041';

		char aleph = '\u05D0';

		char slash = '\\';

		char heart = '\u2764';

		System.out.println("Char Test : " + c + tab + A + aleph + slash + heart);
		
		// short, int, long test
		short myShort = 10;
		int houseNo = 10;
		long myLong = 7846274;
		
		int anotherHouseNo = 125;

		System.out.println("House No : " + houseNo + ", Another house no : " + anotherHouseNo);
		
		int result = houseNo * anotherHouseNo;
		System.out.println("Result : " + result);
		
		int demo = 2147483647; //maximum positive integer
		System.out.println(demo); //prints 2147483647
		
		demo = demo + 1;
		System.out.println(demo); // prints -2147483648
		
		
		// float and double
		float myRating = 1.3f;
		System.out.println(myRating);
		
		float positiveFloat = 3.14f;

		float negativeFloat = -3.14f;
		
		float myFloat = 3.12345678f; //precision 7
		System.out.println("precision : " + myFloat);
		
		
		// double test
		double mark = 2.3;
		double myDouble = 3.123456789123456789; // precision 15

		System.out.println("My DOuble : " + myDouble);
		
		
	}

}
