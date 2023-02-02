package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP64XAndO {

	public static boolean getXAndOCount(String word) {
		int xCount = 0;
		int oCount = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'o') {
				oCount++;
			} else if (word.charAt(i) == 'x') {
				xCount++;
			}
		}
		if (xCount == oCount ) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(getXAndOCount(word));
	}

}
