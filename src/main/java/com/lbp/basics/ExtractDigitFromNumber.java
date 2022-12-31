package com.lbp.basics;

import java.util.Scanner;

public class ExtractDigitFromNumber {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number");
		int numb = sc.nextInt();
		int originalNumb = numb;
		int countOfDigit =0;
		
		while(numb!=0) {
			int digit = numb%10;
			System.out.print(digit+" ");
			countOfDigit++;
			numb = numb/10;
		}
		System.out.println();
		System.out.println("Total digit in "+originalNumb +" is "+countOfDigit);
	}
	

}
