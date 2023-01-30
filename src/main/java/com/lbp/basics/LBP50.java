package com.lbp.basics;

import java.util.Scanner;

public class LBP50 {

	static int sumOfDigit(int numb) {
		int sum = 0;
		while (numb != 0) {
			int digit = numb % 10;
			sum = sum + digit;
			numb = numb / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number1:");
		Scanner sc = new Scanner(System.in);
		int numb1 = sc.nextInt();
		System.out.println("Enter the number2:");
		int numb2 = sc.nextInt();
		int sum = 0;
		for (int i = numb1; i <= numb2; i++) {
			sum = sum + sumOfDigit(i);
		}
		System.out.println(sum);
	}

}
