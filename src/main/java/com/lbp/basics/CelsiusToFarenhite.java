package com.lbp.basics;

import java.util.Scanner;

public class CelsiusToFarenhite {
/*
 * ((c*9)/5)+32
 */

	public static void main(String[] args) {
		System.out.println("Enter Celcius");
		Scanner sc = new Scanner(System.in);
		float celcius = sc.nextFloat();
		
		float fh = ((celcius*9)/5)+32;
		System.out.println(celcius +" Celcius"+" is equal to "+fh+" Farenhite");

	}

}
