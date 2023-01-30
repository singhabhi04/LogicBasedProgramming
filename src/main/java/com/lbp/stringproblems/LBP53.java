package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP53 {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println("Enter the array");
		String intergerArray = sc.nextLine();
		String outPutStr="";
		for (int i = 0; i < inputString.length(); i++) 
		{
			 char c =intergerArray.charAt(i);
			 int charToInt =c-'0';
			 char d =inputString.charAt(charToInt);
			
			outPutStr =outPutStr+d;
		}
System.out.println(outPutStr);
	}

}
