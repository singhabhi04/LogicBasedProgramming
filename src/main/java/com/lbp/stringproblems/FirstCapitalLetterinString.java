package com.lbp.stringproblems;

import java.util.Scanner;

public class FirstCapitalLetterinString {
	
	static void secondWay(String word) {
		for (int i = 0; i < word.length(); i++) {
			char digit = word.charAt(i);
			if (Character.isUpperCase(digit)) {
				System.out.println("First Capital letter in String is " + digit);
				break;
			} 
		}
	
	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		secondWay(word);
		for (int i = 0; i < word.length(); i++) {
			char digit = word.charAt(i);
			if (digit >= 'A' && digit <= 'Z') {
				System.out.println("First Capital letter in String is " + digit);
				break;
			} 
		}
	
	}

}
