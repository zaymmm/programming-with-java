package com.mm.bee.tech;

public class Array {
	
	public static void main(String[] args) {
		int[] numArr1 = new int[3];
		numArr1[0] = 1;
		numArr1[1] = 2;
		numArr1[2] = 3;
		
		for(int i : numArr1) {
			System.out.println(i);
		}
		
		System.out.println("===============");
		
		int[] numArr2 = {1, 2, 3, 4, 5};
		for (int i : numArr2) {
			System.out.println(i);
		}
		
		System.out.println("===============");
		
		int[] numArr3 = new int[] {1, 2, 3, 4};
		for (int i : numArr3) {
			System.out.println(i);
		}
		
		System.out.println("===============");
		
		String[] greeting = new String[] {"Hello", "Hi", "Morning"};
		greeting[1] = "Hay";
		System.out.println(greeting[1]);
		
		
	}

}
