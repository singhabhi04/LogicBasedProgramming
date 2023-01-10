package com.lbp.basics;

import java.util.Scanner;
//revesion
public class LBP27 {
	public static void main(String[] args) {
		System.out.println("Enter number 1");
		Scanner sc = new Scanner(System.in);
		int numb1 = sc.nextInt();
		System.out.println("Enter number 2");
		int numb2 = sc.nextInt();
		System.out.println("Enter number 3");
		int numb3 = sc.nextInt();
		int sum=0;
		
		for(int i=numb1;i<numb2;i++) {
			sum =sum+i;
		}
		
		for(int j=numb2;j>=numb3;j--) {
			
			
			sum = sum+(j);
		}
				System.out.println(sum);
	}

}
