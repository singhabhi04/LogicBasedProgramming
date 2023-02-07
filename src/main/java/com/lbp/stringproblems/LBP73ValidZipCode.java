package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP73ValidZipCode {

	public static boolean validateZipCode(String zipCode) {
		boolean isValid = false;

		if (zipCode.length() == 6) {

			for (int i = 0; i < zipCode.length(); i++) {
				if (Character.isWhitespace(zipCode.charAt(i)) || !(Character.isDigit(zipCode.charAt(i)))) {
					isValid = false;
					break;
				} else {
					isValid = true;

				}
			}

		}
		return isValid;
	}

	public static void main(String[] args) {
		System.out.println("Enter the ZIP Code ");
		Scanner sc = new Scanner(System.in);
		String zipCode = sc.nextLine();
		System.out.println(validateZipCode(zipCode));
		;
	}

}
