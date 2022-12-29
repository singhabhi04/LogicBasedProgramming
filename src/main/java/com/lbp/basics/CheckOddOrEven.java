package com.lbp.basics;

import java.util.Scanner;

public class CheckOddOrEven {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number you want to check");
		 int numb = sc.nextInt();
		 if(numb>0) {
			 if(numb%2 ==0) {
				 System.out.println(numb+" is even");
			 }
			 else {
				 System.out.println(numb+" is odd");
			 }
		 }
		 else {
			 System.out.println("Entered number should be greater than 0");
		 }
	}

}
