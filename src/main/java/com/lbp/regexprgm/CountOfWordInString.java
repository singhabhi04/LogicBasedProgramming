package com.lbp.regexprgm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOfWordInString {

	public static void main(String[] args) {
		System.out.println("Enter the Sentence ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println("Enter the word for which you want repeation count ");
		String word = sc.nextLine();
		int count = 0;
		Pattern p = Pattern.compile(word);
		Matcher m = p.matcher(sentence);
		while (m.find()) {
			System.out.println(m.start() + " ---" + (m.end() - 1) + "----" + m.group());
			count++;
		}

		System.out.println("Total count of word" + word + " is " + count);
	}

}
