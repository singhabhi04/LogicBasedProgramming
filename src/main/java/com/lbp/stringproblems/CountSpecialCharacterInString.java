package com.lbp.stringproblems;

import java.util.Scanner;

public class CountSpecialCharacterInString {

	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine(); 
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z')) {
				continue;
			} else {
				count++;
			}
		}
		System.out.println("No of Special character is " + count);
	}

}
