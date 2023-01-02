package com.lbp.basics;

import java.util.Scanner;

public class SumOfDigitDivisibleByThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int numb = sc.nextInt();
		int sum = 0;
	while(numb!=0) {
		int digit = numb%10;
		if(digit%3==0) {
			sum =sum+digit;
		}
		numb = numb/10;
	}
System.out.println("Sum Of  digits divisible by 3 is "+sum);
	}
}