package com.lbp.stringproblems;

import java.util.Scanner;

public class MagicDate {

	public static void main(String[] args) {
		System.out.println("Enter the Date");
		Scanner sc = new Scanner(System.in);
		String date[] = sc.nextLine().split("-");
		System.out.println(date[2].endsWith(Integer.toString(Integer.parseInt(date[0]) * Integer.parseInt(date[1]))));
	}

}
