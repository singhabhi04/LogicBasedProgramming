package com.lbp.stringproblems;

import java.util.Scanner;

public class NextAlphabetInString {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		
		for(int i=0;i<inputString.length();i++) {
			System.out.print((char)(inputString.charAt(i)+1));
		}

	}

}
