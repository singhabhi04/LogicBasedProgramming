package com.lbp.basics;

import java.util.Scanner;

public class ReturnNextInteger_LB5 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number");
		int numb = sc.nextInt();
		System.out.println("Next number is : "+ReturnNextInteger_LB5.getNextNum(numb));
		
		
	}
	
	public static int getNextNum(int numb) {
		 return numb+1;
	}

}
