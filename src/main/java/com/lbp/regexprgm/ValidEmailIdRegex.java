package com.lbp.regexprgm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailIdRegex {

	public static void main(String[] args) {
		int count = 0;
		Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
		        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
		Matcher m = pattern.matcher("1test@test.");
		while (m.find()) {

			count++;
		}
		if (count == 1) {
			System.out.println("Valid Email Id");
		} else {
			System.out.println("Invalid Email Id");
		}
	}

}
