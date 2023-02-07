package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP79_OtherWay {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);

		String[] inputString = sc.nextLine().split(" ");
		System.out.print(inputString[inputString.length - 1] + " ");

		for (int i = inputString.length - 2; i >= 1; i--) {
			System.out.print(new StringBuffer(inputString[i]).reverse() + " ");

		}
		System.out.print(inputString[0]);

	}
}