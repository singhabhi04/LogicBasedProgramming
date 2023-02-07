package com.lbp.stringproblems;

import java.util.Scanner;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();

		String outputString = "";

		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (outputString.indexOf(ch) < 0) {
				outputString = outputString + ch;
			}

		}
		System.out.println("Output String without duplicate charcter is " + outputString);
	}

}
