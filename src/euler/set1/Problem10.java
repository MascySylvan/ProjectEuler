package euler.set1;

import euler.commons.GenericUtility;

public class Problem10 {

	public static void main(String[] args) {

//		Problem 10:
//		The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//		Find the sum of all the primes below two million.
		
		int total = 1;
		for (int i = 3; i < 100000; i += 2) {
			System.out.println("Current Value: " + i);
			if (GenericUtility.isPrime(i) ) {
				total += i;
			}
		}
		
		System.out.println("Sum: " + total); //Sum: 1179908153
		
	}

}
