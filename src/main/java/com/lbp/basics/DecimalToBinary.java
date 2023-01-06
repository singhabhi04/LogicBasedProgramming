package com.lbp.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number you want to convert to Binary");

		int numb = sc.nextInt();
		// direct method
		System.out.println("Using Integer function to convert to Binary : " + Integer.toBinaryString(numb));

		ArrayList<Integer> bin = new ArrayList<>();

		while (numb > 0) {
			int digit = numb % 2;
			bin.add(digit);
			numb = numb / 2;

		}

		for (int i = bin.size() - 1; i >= 0; i--)
			System.out.print(bin.get(i));

	}

}
