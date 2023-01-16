package com.lbp.regexprgm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingDemo {

	public static void main(String[] args) {
		String matchingPattern ="ab";
		String targetString = "abababaabaabbab";
		int count =0;
		Pattern p = Pattern.compile(matchingPattern);
		Matcher m = p.matcher(targetString);
		while(m.find()) {
			System.out.println(m.start()+" ---"+(m.end()-1)+"----"+m.group());
			count++;
		}
		
System.out.println("Total count is of "+matchingPattern+" is "+count);
	}

}
