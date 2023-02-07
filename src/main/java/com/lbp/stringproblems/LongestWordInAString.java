package com.lbp.stringproblems;

import java.util.Scanner;

public class LongestWordInAString {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();

		String[] word = inputString.split(" ");
		int maxLenght = 0;
		String maxLengthWord = "";
		for (int i = 0; i < word.length; i++) {

			if (word[i].length() > maxLenght) {
				maxLenght = word[i].length();
				maxLengthWord = word[i];
			}

		}
		System.out.println("Word with Maximum Length " + maxLenght + " is " + maxLengthWord);

	}

}
