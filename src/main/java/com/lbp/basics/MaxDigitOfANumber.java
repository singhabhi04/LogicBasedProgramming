package com.lbp.basics;

import java.util.Scanner;

public class MaxDigitOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int numb = sc.nextInt();
		int originalNumb  = numb;
		int maxDigit=0;
		int digit =0;
		while(numb>0) {
			digit =numb%10;
			if(digit>maxDigit) {
				maxDigit=digit;
				
			}
			numb = numb/10;
		}
System.out.println("Max Digit of the number "+originalNumb+" is "+maxDigit);
	}

}
