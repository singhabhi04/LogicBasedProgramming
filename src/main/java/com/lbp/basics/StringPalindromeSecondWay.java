package com.lbp.basics;

import java.util.Scanner;

public class StringPalindromeSecondWay {

	public static void main(String[] args) {
		System.out.println("Enter the String you want to check");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		boolean isPali = true;
		int i = 0;
		int j = word.length() - 1;
		while (i <= j) {
			if (word.charAt(i) != word.charAt(j)) {
				isPali = false;
				break;
			}
			i = ++i;
			j = --j;
		}
		if (isPali) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}