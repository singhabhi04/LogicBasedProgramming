package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP55 {

	public static void main(String[] args) {
		System.out.println("Enter the word1");
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		System.out.println("Enter the word2");
		String word2 = sc.nextLine();
		System.out.println(validateStringEndsWith(word1,word2));
	}

	public static boolean validateStringEndsWith(String word1, String word2) {

		if (word1.endsWith(word2)) {
			return true;
		} else {
			return false;
		}

	}

}
