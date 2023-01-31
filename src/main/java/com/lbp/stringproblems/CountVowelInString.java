package com.lbp.stringproblems;

import java.util.Scanner;

public class CountVowelInString {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();

		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'e'
					|| inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Total number of Vowels are " + count);
	}

}
