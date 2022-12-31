package com.lbp.basics;

import java.util.Scanner;

public class LBP4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sales Count:");
		int saleCount = sc.nextInt();
		if(saleCount>=30 && saleCount<=100) {
			if(saleCount>=30 && saleCount<=50) {
				System.out.println("Category is D");
			}
			else if(saleCount>=51 && saleCount<=60) {
				System.out.println("Category is C");
			}
			else if(saleCount>=61 && saleCount<=80) {
				System.out.println("Category is B");
			}
			else {
				System.out.println("Category is A");

			}



		}
		else {
			System.out.println("Invalid Sale Count");
		}
	}

}
