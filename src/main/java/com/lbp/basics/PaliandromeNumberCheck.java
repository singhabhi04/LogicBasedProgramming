package com.lbp.basics;

import java.util.Scanner;

public class PaliandromeNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which yo want to check");
		int numb = sc.nextInt();
		int originalNumb = numb;
		int reverse = 0;

		while (numb > 0) {
			int digit = numb % 10;
			reverse = (reverse * 10) + digit;
			numb = numb / 10;
		}

		if (reverse == originalNumb) {
			System.out.println(originalNumb + " is Paliandrom Number ");
		} else {
			System.out.println(originalNumb + " is not a Paliandrom Number ");
		}
	}

}
