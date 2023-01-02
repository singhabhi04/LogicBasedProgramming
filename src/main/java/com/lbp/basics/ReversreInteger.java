package com.lbp.basics;

import java.util.Scanner;

public class ReversreInteger {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int numb = sc.nextInt();
		int originalNumb = numb;
		int reverseNumb =0;
		
		while(numb!=0) {
			int digit = numb%10;
			reverseNumb = reverseNumb *10+digit;
			numb = numb/10;
		}
System.out.println("Reverse of "+originalNumb +" is "+reverseNumb);
	}

}
