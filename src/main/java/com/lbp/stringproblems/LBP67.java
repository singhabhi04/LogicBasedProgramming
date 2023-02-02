package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP67 {

	public static boolean repeativeCharacter(String word) {
		boolean found = false;
		for (int i = 0; i < word.length()-1; i++) {
			if (word.charAt(i) == word.charAt(i + 1)) {
				found = true;
			}

		}
		return found;

	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(repeativeCharacter(word));
	}

}
