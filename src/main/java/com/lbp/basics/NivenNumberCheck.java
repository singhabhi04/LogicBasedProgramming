package com.lbp.basics;

import java.util.Scanner;

public class NivenNumberCheck {

	
	//Niven number - if a number is divisible by its sum
	public static void main(String[] args) {
		System.out.println("Enter the number you want to check");
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		int originalNumb = numb;
		int sum =0;
		while(numb>0) {
			int digit = numb%10;
			 sum =sum+digit;
			 numb=numb/10;
			 
			
		}
		if(originalNumb% sum ==0) {
			System.out.println(originalNumb+" is a Niven Number");
		}
		
		else {
			System.out.println(originalNumb+" is not a Niven Number");
		}

	}

}
