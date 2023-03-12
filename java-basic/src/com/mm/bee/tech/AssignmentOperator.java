package com.mm.bee.tech;

public class AssignmentOperator {
	
	// = is used to assign a value to a variable
	int num1 = 11;
	int num2 = 12;
	int result = num1 + num2;
	int result1 = num1 - num2;
	int result2 = num1 * num2;
	int result3 = num1 / num2;
	
	// += is used to assign a value to a variable by adding it to the existing value
	int number1 = 1;
	
	// -= is used to assign a value to a variable by subtracting it to the existing value
	int number2 = 3;
	
	public static void main(String[] args) {
		AssignmentOperator ao = new AssignmentOperator();
		
		int num1 = ao.number1;
		num1 += 2;
		System.out.println(">>> " + num1);
		
		int num2 = ao.number2;
		num2 -= 1; 
		System.out.println(">>> " + num2);
		
		// increment and decrement operator
		// pre and post
		
		// post
		int num3 = 1;
		num3++;
		System.out.println(num3);
		num3--;
		System.out.println(num3);
		
		
		// pre
		int num4 = 5;
		++num4;
		System.out.println(num4);
		// --num4
		
		// difference between pre and post operator
		int num5 = 5;
		System.out.println(">>> " + num5++);
		System.out.println(">>> " + num5);
		System.out.println(">>> " + ++num5);
		
		// num5--
		
		// TODO Relational operator
		// TODO Logical operator
		
		
	}
	

}
