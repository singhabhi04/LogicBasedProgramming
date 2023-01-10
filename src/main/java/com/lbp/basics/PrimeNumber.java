package com.lbp.basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number you want to check for prime");
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		int factor =0;
		if(numb>1) {
			for(int i =1;i<=numb;i++) {
				if(numb%i ==0) {
					factor++;
				}
				
			}
			
			if(factor ==2) {
				System.out.println(numb+" is Prime Number ");
			}
			else {
				System.out.println(numb+" is not Prime Number ");
			}
		}
		else {
			System.out.println("Please enter number greater than 1");
		}
	

	}

}
