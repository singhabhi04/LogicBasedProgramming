package com.lbp.stringproblems;

import java.util.Scanner;

public class LBP56 {

	public static void main(String[] args) {
		System.out.println("Enter the FirstName :");
		Scanner sc = new Scanner(System.in);
		String firstname = sc.nextLine();
		System.out.println("Enter the LastName :");
		String lastname = sc.nextLine();
		
		System.out.println(lastname+" "+firstname);
	}

}
