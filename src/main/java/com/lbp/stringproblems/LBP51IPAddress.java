package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP51IPAddress {

	public static void main(String[] args) {
		System.out.println("Enter the IP Address");
		Scanner sc = new Scanner(System.in);
		String ipAddress = sc.nextLine();
		System.out.println(ipAddress.replace(".", "[.]"));

	}

}
