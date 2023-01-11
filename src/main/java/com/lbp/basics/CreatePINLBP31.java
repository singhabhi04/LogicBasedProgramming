package com.lbp.basics;

import java.util.Scanner;

public class CreatePINLBP31 {

	static int getMaxDigit(int numb) {

		int maxDigit = 0;
		int digit = 0;
		while (numb > 0) {
			digit = numb % 10;
			if (digit > maxDigit) {
				maxDigit = digit;

			}
			numb = numb / 10;
		}
		return maxDigit;
	}

	public static void main(String[] args) {
		System.out.println("Entre three 3 digit number");
		Scanner sc = new Scanner(System.in);
		int numb1 = sc.nextInt();
		int numb2 = sc.nextInt();
		int numb3 = sc.nextInt();
		
		int w = Math.min(Math.min(numb1%10, numb2%10), numb3%10);
		int x = Math.min(Math.min((numb1/10)%10, (numb2/10)%10), (numb3/10)%10);
		int y  = Math.min(Math.min((numb1/100)%10, (numb2/100)%10), (numb3/100)%10);
		int z = Math.max(Math.max(getMaxDigit(numb1),getMaxDigit(numb2)), getMaxDigit(numb3));
		
		int pin = z*1000+y*100+x*10+w;
		System.out.println(pin);
	}

}
