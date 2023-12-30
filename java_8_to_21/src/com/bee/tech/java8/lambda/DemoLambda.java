package com.bee.tech.java8.lambda;

interface InterfaceA {
	void message(String str);
}

//class Xyz implements InterfaceA {
//
//	@Override
//	public void message(String str) {
//		System.out.println("Lambda Demo" + str);
//	}
//
//}

public class DemoLambda {

	public static void main(String[] args) {

		InterfaceA obj;

//		obj = new InterfaceA() { // Anonymous Interface
//
//			@Override
//			public void message(String str) {
//				System.out.println("Lambda Demo" + str);
//			}
//		};
		
		obj = str -> System.out.println("Lambda Demo: " + str);

		obj.message("Zay");

	}

}
