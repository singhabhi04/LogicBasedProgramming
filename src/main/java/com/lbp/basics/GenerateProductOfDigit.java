package com.lbp.basics;

import java.util.Scanner;

public class GenerateProductOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int numb = sc.nextInt();
		int originalNumb = numb;
		int product = 1;

		while (numb > 0) {
			int digit = numb % 10;
			product = product * digit;
			numb = numb / 10;
		}

		System.out.println("Product of " + originalNumb + " is " + product);
	}

}
