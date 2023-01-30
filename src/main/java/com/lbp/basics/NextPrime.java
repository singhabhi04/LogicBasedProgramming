package com.lbp.basics;

import java.util.Scanner;

public class NextPrime {

	static boolean checkPrimeNumber(int numb) {
		int factor = 0;
		for (int i = 1; i <= numb; i++) {
			if (numb % i == 0) {
				factor++;
			}
		}

		if (factor == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		
		while(true) {
			if(checkPrimeNumber(numb)) {
				System.out.println(numb);
				break;
			}
			numb++;
		}

	}

}
