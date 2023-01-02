package com.lbp.basics;

import java.util.Scanner;

public class DuckNumber {
public static int reverseNumber(int numb) {
	int 	reverseNumb=0;
	while(numb!=0) {
		int digit = numb%10;
	 	reverseNumb = reverseNumb *10+digit;
		numb = numb/10;
	}
	return reverseNumb;
}
	public static void main(String[] args) {
		/*
		 * Duck number is another special positive non-zero number that contains zero in it. 
		 * The digit zero should not be presented at the starting of the number.
		 *  Zero can be present at any of the positions except the beginning of the number.
		 */
		//This solution is partially correct
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number");
		int numb = sc.nextInt();
		int revNumb = reverseNumber(numb);
		System.out.println(revNumb);
		int count =0;
		 while(revNumb!=0) {
			 int digit = revNumb%10;
			 count++;
			 
			 if(digit ==0 && count ==1) {
				 System.out.println("Number is not a duck number");
				 
			 }
			 else if (digit==0 && count>1) {
				 System.out.println("Number is  a duck number");
				 
			 }
			 revNumb = revNumb/10;
		 }
		
	}

}
