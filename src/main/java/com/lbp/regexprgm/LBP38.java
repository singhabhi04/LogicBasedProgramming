package com.lbp.regexprgm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Count of charcter other than English letter, number and white Space in String
public class LBP38 {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int count =0;
		Pattern pattern = Pattern.compile("[^a-z A-Z 0-9 \\s]");
		Matcher matcher = pattern.matcher(word);
		while(matcher.find()) {
			System.out.println(matcher.group()+"--->"+matcher.start()+"------>"+(matcher.end()-1));
			count ++;
		}
		System.out.println("Count of charcter other than English letter, number and white Space is "+count);
	}

}
