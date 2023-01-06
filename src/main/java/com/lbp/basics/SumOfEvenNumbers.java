package com.lbp.basics;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number Range1");
		Scanner sc = new Scanner(System.in);
		int range1 = sc.nextInt();
		System.out.println("Enter the number Range2");
		int range2 =sc.nextInt();
		int sum =0;
		for(int i=range1;i<=range2;i++) {
			if(i%2==0) {
				sum =sum+i;
			}
		}
		System.out.println("Sum Of Even Numbers between "+range1+" and "+range2 +" is :"+sum);
	}

}
