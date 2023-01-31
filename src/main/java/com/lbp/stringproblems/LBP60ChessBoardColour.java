package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP60ChessBoardColour {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		char[] input = inputString.toCharArray();
		
		
		int x = Character.getNumericValue(input[0]);
		int y = Character.getNumericValue(input[1]);
		System.out.println(x+"-->"+y);
		if(x%2==y%2) {
			System.out.println("White");
		}
		else {
			System.out.println("Black");
		}
		

	}
}