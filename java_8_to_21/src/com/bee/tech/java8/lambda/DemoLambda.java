package com.bee.tech.java8.lambda;

interface InterfaceA {
	void message(String str);
}

class Xyz implements InterfaceA {

	@Override
	public void message(String str) {
		System.out.println("Implement function: " + str);
	}

}

public class DemoLambda {

	public static void main(String[] args) {

		InterfaceA obj;


		obj = new InterfaceA() { // Anonymous Interface

			@Override
			public void message(String str) {
				System.out.println("Anonymous function: " + str);
			}
		};
		
		obj = str -> System.out.println("Lambda function: " + str);
		
		obj = str -> System.out.println("Lambda Demo: " + str);

		obj = new Xyz();
		obj.message(" :Zay");

	}

}
