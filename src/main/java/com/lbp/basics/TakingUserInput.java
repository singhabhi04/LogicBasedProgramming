package com.lbp.basics;

import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {
	 Scanner obj = new Scanner(System.in);
	 System.out.println("Enter the value of a");
	 int a = obj.nextInt();
	 System.out.println("Enter the value of b");
	 int b = obj.nextInt();
	 System.out.println("Enter the value of c");
	 int c = obj.nextInt();
	 int sum = a+b+c;
	 System.out.println("Sum of a,b,c is "+sum);

	}

}
