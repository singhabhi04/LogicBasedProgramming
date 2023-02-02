package com.lbp.stringproblems;

import java.util.Scanner;

public class RemoveVowelsFromString {

	public static String removeVowelsUsingFunction(String word) {
		return word.replaceAll("[aeiou]", "");
	}

	public static String removeVowels(String inputString) {
		String newWord = "";
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'e'
					|| inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u') {
				continue;

			} else {
				newWord = newWord + inputString.charAt(i);
			}

		}
		return newWord;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(removeVowels(word));
		System.out.println(removeVowelsUsingFunction(word));
	}

}
