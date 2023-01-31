package com.lbp.stringproblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MaxOccuringCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
	
		char[] input = inputString.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			if (charMap.containsKey(input[i])) {
				charMap.put(input[i], charMap.get(input[i]) + 1);
			} else {
				charMap.put(input[i], 1);
			}
		}
		//System.out.println(charMap);

		Iterator<Character> it = charMap.keySet().iterator();
		int max = 0;
		char digit = 0;
		while (it.hasNext()) {
			Character key = it.next();
			int value = charMap.get(key);
			if (value > max) {
				max = value;
				digit = key;
			}

		}
		System.out.println(digit + " ---> " + max);
	}
}