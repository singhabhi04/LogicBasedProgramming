package com.lbp.basics;

import java.util.Scanner;

public class MagicDate {

	static int countDigit(int numb) {
		int count = 0;
		while (numb > 0) {
			int digit = numb % 10;
			numb = numb / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Date:");
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		System.out.println("Enter the Date:");
		int month = sc.nextInt();
		System.out.println("Enter the Year:");
		int year = sc.nextInt();

		int dayMonth = date * month;

		if (countDigit(dayMonth) == 1) {
			if (year % 10 == dayMonth) {
				System.out.println("Magic Date");
			} else {
				System.out.println("Not a magic date");
			}
		} else if (countDigit(dayMonth) == 2) {

			if (year % 100 == dayMonth) {
				System.out.println("Magic Date");
			} else {
				System.out.println("Not a magic date");
			}
		} else if (countDigit(dayMonth) == 3) {
			if (year % 1000 == dayMonth) {
				System.out.println("Magic Date");
			} else {
				System.out.println("Not a magic date");
			}
		}

	}

}
