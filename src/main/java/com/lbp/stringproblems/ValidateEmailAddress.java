package com.lbp.stringproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailAddress {

	public static void main(String[] args) {
		System.out.println("Enter the Email you want to check");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		Pattern p = Pattern.compile("[a-z]+[0-9|_]@gmail[.]com");
		Matcher m = p.matcher(email);
		if (m.find() && (m.group()).equals(email)) {
			System.out.println("Valid email");

		} else {
			System.out.println("Invalid Email");
		}

	}

}
