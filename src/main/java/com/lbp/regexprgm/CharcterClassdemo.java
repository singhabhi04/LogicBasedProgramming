package com.lbp.regexprgm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharcterClassdemo {

	public static void reGex(String pattern, String inputString) {
		String matchingPattern = pattern;
		String targetString = inputString;
		int count = 0;
		Pattern p = Pattern.compile(matchingPattern);
		Matcher m = p.matcher(targetString);
		while (m.find()) {
			System.out.println(m.start() + " ---" + (m.end() - 1) + "----" + m.group());
			count++;
		}
		System.out.println("Total match is " + count);
	}

	public static void main(String[] args) {
		reGex("\\s", "test@1234 ABHi90 8787");
		System.out.println("*****************************");
		reGex("\\S", "test@1234 ABHi90 8787");
		System.out.println("*****************************");
		reGex("\\d", "test@1234 ABHi90 8787");
		System.out.println("*****************************");
		reGex("\\D", "test@1234 ABHi90 8787");
		System.out.println("*****************************");
		reGex("\\w", "test@1234 ABHi90 8787");
		System.out.println("*****************************");
		reGex("\\W", "test@1234 ABHi90 8787");
		System.out.println("*****************************");
		reGex(".", "test@1234 ABHi90 8787");
	}

}
