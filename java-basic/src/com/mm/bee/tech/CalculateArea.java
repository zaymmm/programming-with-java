package com.mm.bee.tech;

import java.util.Scanner;

public class CalculateArea {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// READ height
		System.out.println("Enter height : ");
		int height = scanner.nextInt();
		
		// READ width
		System.out.println("Enter width : ");
		int width = scanner.nextInt();
		
		// COMPUTE areas as height times width
		int area = height * width;
		
		// PRINT area
		System.out.println("Area : " + area);
	}

}
