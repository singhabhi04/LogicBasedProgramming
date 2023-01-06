package com.lbp.basics;

import java.util.Scanner;

public class CheckBirthday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month");
		String month = sc.nextLine();
		System.out.println("Enter the Day");
		int day = sc.nextInt();
		System.out.println(checkBirthDay(month, day));
	}

	public static int checkBirthDay(String month, int day) {
		if (month.equals("July" ) && day == 5) {
			return 1;
		} else
			return 0;

	}

}
