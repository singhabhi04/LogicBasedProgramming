package com.lbp.basics;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter the String you want to check");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String reverseString="";
		for(int i=word.length()-1;i>=0;i--) {
			reverseString = reverseString+word.charAt(i);
		}
		
		if(reverseString.equals(word)) {
			System.out.println(word+" is palindrome");
		}
		else {
			System.out.println(word+" is not palindrome");
		}
	}

}
