package com.lbp.stringproblems;

import java.util.Scanner;

public class IndexOfVowelInString {
	
	public static int getIndexOfFirstVowel(String inputString) {
		
		char[] charArry = inputString.toCharArray();
		int index =0;
		for(int i=0;i<charArry.length;i++) {
			if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'e'
					|| inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u') {
				index =i;
				break;
			}
		}
		return index;
		
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println(getIndexOfFirstVowel(inputString));
	}

}
