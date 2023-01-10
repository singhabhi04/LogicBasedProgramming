package com.lbp.basics;

import java.util.Scanner;

public class PrimeNumberBetweenNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number1 ");
		Scanner sc = new Scanner(System.in);
		int numb1 = sc.nextInt();
		System.out.println("Enter the number2 ");
		int numb2 = sc.nextInt();
		int factor = 0;
		int count =0;
		for (int i = numb1; i <= numb2; i++) {
			for (int j = 1; j <= numb2; j++) {
				if (i % j == 0) {
					factor++;
				}
			}
			if(factor ==2) {
				System.out.println(i+" is a Prime Number");
				factor=0;
				count++;
			}
			else {
				
				factor=0;
			}

		}
		System.out.println("Total Prime numbers between "+numb1+" and "+numb2 +" is "+count );

	}

}
