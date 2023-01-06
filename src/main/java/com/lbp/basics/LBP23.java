package com.lbp.basics;

import java.util.Scanner;

public class LBP23 {
//2 digit  numb = sum of digit +(product of digit) eg 59 = ((5+9 )+(5*9))
	public static void main(String[] args) {
		System.out.println("Enter the number you want to check");
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		int origibalNumb = numb;

		int digit2 = numb % 10;
		int digit1 = (numb/10)%10;
		System.out.println(digit1 );
		System.out.println(digit2 );
		if (origibalNumb == ((digit1 + digit2) + (digit1 * digit2))) {
			System.out.println("Special number");
		} else {
			System.out.println(" Not a special number");
		}

	}

}
