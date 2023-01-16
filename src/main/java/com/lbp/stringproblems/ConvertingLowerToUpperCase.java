package com.lbp.stringproblems;
//converting lower case to upper case and upper case to lower
// A- 65
//a-A+32

import java.util.Scanner;

public class ConvertingLowerToUpperCase {
public static void main(String[] args) {
	System.out.println("Enter the String :");
	Scanner sc = new Scanner(System.in);
	String word = sc.nextLine();
	String finalString ="";
	for(int i=0;i<word.length();i++) {
		if(word.charAt(i)>='A' && word.charAt(i)<='Z') {
			finalString =finalString+(char)(word.charAt(i)+32);
		//	System.out.print((char)(word.charAt(i)+32));
		}
		else {
			finalString =finalString+(char)(word.charAt(i)-32);
			//System.out.print((char)(word.charAt(i)-32));
		}
	}
	System.out.println("Final String is "+finalString);
}
}
