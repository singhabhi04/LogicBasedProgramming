package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP38 {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == ' ') {
				continue;
			} else {
				count++;
			}

		}
		System.out.println("Count of charcter other than English letter, number and white Space is " + count);

	}
}