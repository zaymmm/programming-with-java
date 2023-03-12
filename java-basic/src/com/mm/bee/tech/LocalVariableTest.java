package com.mm.bee.tech;

public class LocalVariableTest {

	String message = "Global Variable !"; // global variable

	public void showGlobalMessage(String message) {
		System.out.println(message);
	}

	public void showLocalMessage() {
		String localMsessaeg = "Local Variable !"; // local variable
		System.out.println(localMsessaeg);
		System.out.println(this.message);
	}

	public static void main(String[] args) {
		LocalVariableTest localV = new LocalVariableTest();
		localV.showLocalMessage();
		
		localV.showGlobalMessage("I'm Message");
	}

}
