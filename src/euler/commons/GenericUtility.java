package euler.commons;

import java.util.LinkedList;
import java.util.List;

public class GenericUtility {
	
	public static boolean isPrime(long n) {
		
		if (n > 1) {
			boolean primeCheck = true;
			long firstCheckingTerm = (n - (n % 2) ) / 2;
			
			for (long i = firstCheckingTerm; i > 1; i--) {
				if (n % i == 0) {
					primeCheck = false;
					break;
				}
			}
			
			return primeCheck; 
		}
		
		return false;
	}
	
	public static List<Long> getFactors(long n, boolean primesOnly) {
		List<Long> factors = new LinkedList<Long>();
		
		if (n > 1) {
			long firstCheckingTerm = (n - (n % 2) ) / 2;
			
			List<Long> factorsTemp = new LinkedList<Long>();
			
			long x = firstCheckingTerm;
			while (x > 1) {
				System.out.println("Current Value: " + x);
				if (n % x == 0) {
					factorsTemp.add(new Long(x) );
				}
				
				if ( (x - (x % 10) ) / 10 > 1000000) {
					x = x - (x - (x % 10) ) / 10;
				} else {
					x--;
				}
			}
			
			if (primesOnly) {
				for (int i = 0; i < factorsTemp.size(); i++) {
					if (isPrime(factorsTemp.get(i).longValue() ) ) {
						factors.add(factorsTemp.get(i) );
					}
				}
			} else {
				return factorsTemp;
			}
		}
		
		return factors;
	}

	public static boolean isPerfectSquare(int n) {
		
		for (int i = n; i > 0; i--) {
			int tempSquare = n * n;
			
			if (tempSquare == n) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean isPythTriple(int a, int b, int c) {
		
		boolean check = (a * a) + (b * b) == (c * c);
		
		if (check) {
			return true;
		}
		
		return false;
	}
}
