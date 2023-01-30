package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP58 {

	public static void main(String[] args) {
		System.out.println("Enter the First Word :");
		Scanner sc = new Scanner(System.in);
		String firstWord = sc.nextLine();
		System.out.println("Enter the Second Word :");
		String secondWord = sc.nextLine();
		System.out.println(firstWord.substring(0, 1).toUpperCase() + firstWord.substring(1)
				+ (secondWord.substring(0, 1).toUpperCase() + secondWord.substring(1)));

	}

}
