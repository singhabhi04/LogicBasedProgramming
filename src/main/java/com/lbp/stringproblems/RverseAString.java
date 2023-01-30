package com.lbp.stringproblems;

import java.util.Scanner;

public class RverseAString {

	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		String reverseString = "";

		for (int i = inputString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + inputString.charAt(i);
		}
		System.out.println("Reverse of " + inputString + " is ---> " + reverseString);
	}

}
