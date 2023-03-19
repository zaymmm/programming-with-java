package com.mm.bee.tech;

public class ForEachLoop {

	public static void main(String[] args) {

		for (int count = 0; count < 10; count++) {
			//System.out.println(count);
		}
		
		String phrase = "Whatch what you say !";
		
		for(char c : phrase.toCharArray()) {
			System.out.println(c);
			if(c == 'y') {
				break;
			}
		}
		
		int strCount = 0;
		for(char c : phrase.toCharArray()) {
			System.out.println(c);
			
			if(c == 'a') {
				continue;
			}
			strCount++;
		}
		
		System.out.println(strCount);
	}

}
