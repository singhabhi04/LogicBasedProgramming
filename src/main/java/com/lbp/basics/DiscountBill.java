package com.lbp.basics;

import java.util.Scanner;

public class DiscountBill {

	public static void main(String[] args) {
		System.out.println("Enter the Bill Amount");
		Scanner sc = new Scanner(System.in);
		
		double numb = sc.nextDouble();
		double originalBill =numb;
		int discount = 0;
		while (numb != 0) {
			int digit = (int)numb % 10;
			if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
				discount = discount + digit;
			}
			numb = numb / 10;
		}
		System.out.println("Discount % on Bill is : " + discount);
		System.out.println("Final Bill is " + (originalBill - ((originalBill) * ((double)discount/ 100))));
	}

}
