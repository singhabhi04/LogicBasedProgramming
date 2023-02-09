package com.lbp.stringproblems;

import java.util.Arrays;
import java.util.Scanner;

public class LBP84CharactersInOrder {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char[] ch = word.toCharArray();
		
		Arrays.sort(ch);
		String s2= new String(ch);
		System.out.println(word.equals(s2));

	}

}
