package com.lbp.basics;

import java.util.Scanner;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		System.out.println("Value of fibonacci series at postion");  
		Scanner sc = new Scanner(System.in);
		int count =sc.nextInt();
		int [] fib = new int[count];
		fib[0]=0;
		fib[1] =1;
		
		
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<count;i++) {
			n3=n2+n1;
			System.out.print(n3+" ");
			fib[i]=n3;
			n1=n2;
			n2=n3;
		}
		System.out.println();
		System.out.println("Value at "+count+" postion of fibinacci series is "+fib[count-1]);


	}

}
