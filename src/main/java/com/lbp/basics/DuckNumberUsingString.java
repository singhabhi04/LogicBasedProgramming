package com.lbp.basics;

import java.util.Scanner;

public class DuckNumberUsingString {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number");
		String numb = sc.nextLine();
		System.out.println(numb.charAt(0));
	char a = numb.charAt(0);
		System.out.println(numb.charAt(0) !='0');
		System.out.println(numb.contains("0"));
		if((numb.contains("0")) && (numb.charAt(0) != '0')) {
			System.out.println(numb+" Number is duck number");
		}
		else {
			System.out.println(numb+" Number is not duck number");
		}

	}

}
