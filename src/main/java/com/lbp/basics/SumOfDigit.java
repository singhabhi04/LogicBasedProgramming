package com.lbp.basics;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number");
		int numb = sc.nextInt();
		int sum =0;
		while(numb!=0) {
			sum = sum +numb%10;
			numb = numb/10;
		}
System.out.println("Sum of digit is "+sum);
	}

}
