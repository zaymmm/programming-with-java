package com.mm.bee.tech;

import java.util.Scanner;

public class UserInputTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter PassCode : ");
		
		int passCode = scanner.nextInt(); // read user input
		
		System.out.println("Pass Code >>> " + passCode);
		
		
	}

}
