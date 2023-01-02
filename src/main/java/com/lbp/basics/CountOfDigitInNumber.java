package com.lbp.basics;

import java.util.Scanner;

public class CountOfDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number");
		int numb = sc.nextInt();
		int originalNumb = numb;
		System.out.println("Enter the digit for which you want occurence count");
		int digit = sc.nextInt();
		int count =0;
		
		while(numb>0) {
			int dig = numb%10;
			if(dig == digit) {
				count++;
			}
			numb = numb/10;
		}
		
		System.out.println("The occurence of "+digit+" in "+originalNumb+" is "+ count);
	}

}
