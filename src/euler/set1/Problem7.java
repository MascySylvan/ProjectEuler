package euler.set1;

import euler.commons.GenericUtility;

public class Problem7 {

	public static void main(String[] args) {

//		Problem 7:
//		By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//		What is the 10001st prime number?
		
		long currentValue = 2;
		long currentPrime = 2;
		int primeCtr = 0;
		
		while (primeCtr < 10001) {
			if (GenericUtility.isPrime(currentValue) ) {
				primeCtr++;
				System.out.println("Prime No. " + primeCtr + ": " + currentValue);
				currentPrime = currentValue;
			}
			
			currentValue++;
		}
		
		System.out.println("10001st Prime: " + currentPrime); //10001st Prime: 104743
	}

}
