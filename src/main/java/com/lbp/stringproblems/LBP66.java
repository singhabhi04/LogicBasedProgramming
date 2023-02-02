package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP66 {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		for(int i=0;i<word.length();i++) {
			System.out.print(word.charAt(i)+""+word.charAt(i));
		}

	}

}
