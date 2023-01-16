package com.lbp.basics;

import java.util.Scanner;

public class TakingArrayAsInput {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numb[] = new int[size];
		for (int i = 0; i < numb.length; i++) {
			System.out.println("Enter values in array");
			numb[i] = sc.nextInt();
		}
		System.out.print("Elements of arrays are ");
		for(int i=0;i<numb.length;i++) {
			System.out.print(numb[i]+" ");
		}

	}

}
