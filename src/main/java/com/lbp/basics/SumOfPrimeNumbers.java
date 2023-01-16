package com.lbp.basics;

import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static boolean isPrime(int numb) {
		int factor = 0;
	
			for(int i=1;i<=numb;i++) {
				if(numb%i==0) {
					factor++;
				}
			}
		if(factor==2) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number1 ");
		Scanner sc = new Scanner(System.in);
		int numb1 = sc.nextInt();
		System.out.println("Enter the number2 ");
		int numb2 = sc.nextInt();
		int sum = 0;
		for (int i = numb1; i <=numb2; i++) {
			if(isPrime(i)) {
				sum =sum+i;
			}
		}
		System.out.println("sum of prime numbers between " + numb1 + " and " + numb2 + " is " + sum);

	}

}
