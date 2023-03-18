package com.mm.bee.tech;

import java.util.Scanner;

public class CalculateCircle {
	
	public static void main(String[] args) {
		// TODO write pseudo code
		
		Scanner scanner = new Scanner(System.in);
		
		double pi = 3.142;
		
		System.out.println("Enter radius : ");
		double radius = scanner.nextDouble();
		
		double circle = pi * (radius * radius);
		System.out.println("Circle : " + circle);
		
	}
	
}
