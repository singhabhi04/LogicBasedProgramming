package com.lbp.basics;

import java.util.Scanner;

public class LuckyCustomer {

	public static void main(String[] args) {
		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		
		System.out.println(fib(numb));

	}
	public static int fib(int n) {
		if(n==0 || n==1) {
			
			return n;
			}
			else {
				return fib(n-1)+fib(n-2);
			}
		}
	}
	
	


