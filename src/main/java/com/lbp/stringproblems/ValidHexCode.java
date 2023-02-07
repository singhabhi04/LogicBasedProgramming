package com.lbp.stringproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHexCode {

	

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String hexCode = sc.nextLine();
		Pattern pattern = Pattern.compile("#[0-9a-fA-F]{6}");
		Matcher matcher = pattern.matcher(hexCode);
		if(matcher.find()) {
			System.out.println("valid Hex Code");
		}
		else {
			System.out.println("invalid Hex Code");
		}
		

	}

}
