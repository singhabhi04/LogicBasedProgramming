package com.lbp.basics;

import java.util.Scanner;

public class LeapYearLBP3 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the year you want to check for Leap Year:");
		   int year = sc.nextInt();
		  if((year%4 ==0 && year%100!=0)||(year%400 ==0)) {
			  System.out.println(year+" is Leap Year");
		  }
		  else {
			  System.out.println(year+" is not Leap Year");
		  }

	}

}
