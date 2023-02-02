package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP65 {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		System.out.println(word.substring(0, 2)+"..."+word.substring(0, 2)+"..."+word+"?");

	}

}
