package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP52StonesAndJewels {

	public static void main(String[] args) {
		System.out.println("Enter the Stones");
		Scanner sc = new Scanner(System.in);
		String stones = sc.nextLine();
		System.out.println("Enter the Jewels");
		String jewels = sc.nextLine();
		int count = 0;
		for (int i = 0; i < jewels.length(); i++) {

			for (int j = 0; j < stones.length(); j++) {
				if (jewels.charAt(i) == stones.charAt(j)) {
					count++;
				}
			}
			System.out.println("count of " + jewels.charAt(i) + " is " + count);
			count=0;
		}
	}

}
