package com.lbp.basics;

import java.util.Scanner;

public class SumOfPrimeNumberDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int numb = sc.nextInt();
		int sum = 0;
	while(numb!=0) {
		int digit = numb%10;
		if(digit== 2|| digit ==3|| digit ==5 || digit ==7) {
			sum =sum+digit;
		}
		numb = numb/10;
	}
System.out.println("Sum Of Prime digits is "+sum);
	}
}