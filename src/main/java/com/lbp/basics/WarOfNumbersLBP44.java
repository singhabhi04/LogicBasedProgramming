package com.lbp.basics;

public class WarOfNumbersLBP44 {

	static int diffOfEvenOdd(int[] numbers) {
		int sumOfEven = 0;
		int sumOfOdd = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sumOfEven = sumOfEven + numbers[i];

			} else {
				sumOfOdd = sumOfOdd  + numbers[i];
			}
		}
		return (sumOfEven-sumOfOdd);

	}

	public static void main(String[] args) {
		int []numb = {10,5,7,6,5,9,8};
		
System.out.println(Math.abs(diffOfEvenOdd(numb)));
//Math.abs return absolute value
	}

}
