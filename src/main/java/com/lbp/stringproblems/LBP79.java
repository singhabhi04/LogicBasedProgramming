package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP79 {

	public static String reverseString(String word) {
		String revWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			revWord = revWord + word.charAt(i);

		}

		return revWord;

	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);

		String[] inputString = sc.nextLine().split(" ");
		String resultString = "";
		String[] outputString = new String[inputString.length];
		outputString[0] = inputString[inputString.length - 1];
		outputString[inputString.length - 1] = inputString[0];
		for (int i = 1; i < inputString.length - 1; i++) {

			outputString[i] = reverseString(inputString[i]);

		}

		for (int i = 0; i < outputString.length; i++) {
			resultString = resultString + outputString[i]+" ";
		}

		System.out.println(resultString);
	}

}
