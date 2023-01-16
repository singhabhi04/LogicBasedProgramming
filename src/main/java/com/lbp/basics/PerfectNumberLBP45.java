package com.lbp.basics;

import java.util.Scanner;

public class PerfectNumberLBP45 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		int sum=0;
		for(int i=1;i<numb;i++)
		{
			if(numb%i==0) {
				sum = sum +i;
			}
		}
		if(sum == numb) {
			System.out.println(numb+" is a perfect number");
		}
		else {
			System.out.println(numb+" is not a perfect number");
		}
	}

}
