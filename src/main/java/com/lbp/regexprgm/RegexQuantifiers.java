package com.lbp.regexprgm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuantifiers {
// +,*,? -Regex quantifiers
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
		reGex("a", "abaabaacaaabccaaaggvvvAa");
		System.out.println("*****************************");
		reGex("aa", "abaabaacaaabccaaaggvvvAa");
		System.out.println("*****************************");
		reGex("a+", "abaabaacaaabccaaaggvvvAa");
		System.out.println("*****************************");
		reGex("a*", "abaabaacaaabccaaaggvvvAa");
		System.out.println("*****************************");
		reGex("a?", "abaabaacaaabccaaaggvvvAa");
		System.out.println("*****************************");
	}

}
