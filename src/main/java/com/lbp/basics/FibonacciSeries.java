package com.lbp.basics;

import java.util.Scanner;

public class FibonacciSeries {
	
	

	public static void main(String[] args) {
		System.out.println("Enter Fibonacci series count ");  
		Scanner sc = new Scanner(System.in);
		int count =sc.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<count;i++) {
			n3=n2+n1;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}


	}

}
