package com.lbp.basics;

import java.util.Scanner;

public class FarenhiteToCelcius {
	/*
	 * c = (f-32)*5/9
	 */

	public static void main(String[] args) {
		System.out.println("Enter Farenhite");
		Scanner sc = new Scanner(System.in);
		float fh = sc.nextFloat();
		
		float celcius = ((fh-32)*5)/9;
		System.out.println(fh +" Farenhite"+" is equal to "+celcius+" Celcius");


	}

}
