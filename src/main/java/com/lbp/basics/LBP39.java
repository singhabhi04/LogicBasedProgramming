package com.lbp.basics;

public class LBP39 {

	public static void main(String[] args) {
		System.out.println(blackJack(98, 89));
	}

	public static int blackJack(int numb1, int numb2) {

		if (numb1 > 21 && numb2 > 21) {
			return 0;
		} else if (numb1 > 21) {
			return numb2;
		} else if (numb2 > 21) {
			return numb1;
		} else {
			return Math.max(numb1, numb2);
		}

	}

}
