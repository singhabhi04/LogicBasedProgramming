package com.lbp.basics;

import java.util.Scanner;

public class LBP2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int numb = sc.nextInt();
		
		if(numb>=1 && numb<=100) {
			if(numb%2 !=0) {
				System.out.println("Weird");
			}
			else {
				if(numb>=2 && numb<=5) {
					System.out.println("Not Weired");
					
				}
				else if(numb>=6 && numb<=20) {
					System.out.println("Weired");
				}
				else {
					System.out.println("Not Weired");
				}
			}
			
		}
	}

}
