package euler.set1;

import java.util.List;

import euler.commons.GenericUtility;

public class Problem3 {

	public static void main(String[] args) throws Throwable{
		
//		Problem 3:
//		The prime factors of 13195 are 5, 7, 13 and 29.
//		What is the largest prime factor of the number 600,851,475,143 ?
		
		long n = Long.parseLong("600851475143");
		List<Long> factors = GenericUtility.getPrimeFactors(n);
		
		long largestPrime = n;
		
		if (factors.size() > 0) {
			largestPrime = factors.get(0).longValue();
		}
		
		System.out.println("Largest Prime: " + largestPrime); //Largest Prime: 6857

	}

}
