package com.mm.bee.tech;

import java.util.Scanner;

public class CalculateAge {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int currentYear = 2023;
		
		System.out.println("Enter your birth date : ");
		int birthDate = scanner.nextInt();
		
		int age = currentYear - birthDate;
		System.out.println("Your age is : " + age);
	}

}
