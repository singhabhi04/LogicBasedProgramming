package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP48CalculateSeconds {

	public static void main(String[] args) {
		System.out.println("Enter the time");
		Scanner sc = new Scanner(System.in);
		String time[] = sc.nextLine().split(":");
		int mininSec =Integer.parseInt(time[0]) *60;
		int seconds =Integer.parseInt(time[1]);
		System.out.println("Total seconds is " +(mininSec+seconds));

	}

}
