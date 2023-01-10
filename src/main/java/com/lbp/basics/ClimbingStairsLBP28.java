package com.lbp.basics;

import java.util.Scanner;
/*
 * good example -practice again
 */
public class ClimbingStairsLBP28 {

	public static int getfibonacciValue(int steps) {

		int[] fib = new int[steps ];
		fib[0] = 1;
		fib[1] = 2;

		int n1 = 1;
		int n2 = 2;
		int n3;

		for (int i = 2; i < fib.length; i++) {
			n3 = n2 + n1;

			fib[i] = n3;
			n1 = n2;
			n2 = n3;
		}

		return fib[fib.length-1];
	}

	public static int noOfWays(int steps) {

		if (steps == 1 || steps == 2 )
			return steps;
		else if (steps > 2) {

		}
		return getfibonacciValue(steps);

	}

	public static void main(String[] args) {
		System.out.println("Enter the number of Stairs");
		Scanner sc = new Scanner(System.in);
		int steps = sc.nextInt();
		System.out.println(noOfWays(steps));

	}

}
