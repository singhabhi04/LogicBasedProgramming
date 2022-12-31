package com.lbp.basics;

import java.util.Scanner;

public class CoffeCupLPB6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Coffee cup you want :");
		int numb = sc.nextInt();

		System.out.println("The coffee cup you will receive  is :" + getCoffeeCup(numb));

	}

	public static int getCoffeeCup(int numb) {

		return (numb + (numb / 6));
	}

}
