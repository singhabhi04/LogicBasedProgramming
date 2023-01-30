package com.lbp.stringproblems;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		System.out.println("Enter the First Word :");
		Scanner sc = new Scanner(System.in);
		char ch1[] = sc.nextLine().toCharArray();
		System.out.println("Enter the Second Word :");
		char ch2[] = sc.nextLine().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1, ch2));
	}

}
