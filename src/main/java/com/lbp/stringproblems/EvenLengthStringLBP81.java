package com.lbp.stringproblems;

import java.util.Scanner;

public class EvenLengthStringLBP81 {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String[] inputString = sc.nextLine().split(" ");
		String outPutString = "";
		for (int i = 0; i < inputString.length; i++) {
			if (inputString[i].length() % 2 == 0) {
				outPutString = outPutString + inputString[i] + " ";
			}

		}
		System.out.println("Even words in String :-->" + outPutString);
	}

}
