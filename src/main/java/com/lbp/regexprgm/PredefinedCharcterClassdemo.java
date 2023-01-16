package com.lbp.regexprgm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharcterClassdemo {

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
		//reGex("[abc]", "aRDBCD#@12^&b##WcR^&*()");
		//reGex("[ABC]", "aRDBCD#@12^&b##WcR^&*()");
		//reGex("[a-z A-Z]", "aRDBCD#@12^&b##WcR^&*()");
	//	reGex("[0-9]", "aRDBCD#@12^&b##WcR^&*()");
	//	reGex("[a-z A-Z 0-9]", "aRDBCD#@12^&b##WcR^&*()");
		reGex("[^a-z A-Z 0-9]", "aRDBCD#@12^&b##WcR^&*()");
		reGex("[^0-9]", "aRDBCD#@12^&b##WcR^&*()");
	}

}
