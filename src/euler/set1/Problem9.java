package euler.set1;

import euler.commons.GenericUtility;

public class Problem9 {

	public static void main(String[] args) {

//		Problem 9:
//		A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//		a^2 + b^2 = c^2
//		For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//		There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//		Find the product abc.
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i = 1; i <= 998; i++) {
			for (int k = 1; k <= 999 - i; k++) {
				int tempA = i;
				int tempB = k;
				int tempC = 1000 - i - k;
				
				if (GenericUtility.isPythTriple(tempA, tempB, tempC) ) {
					a = tempA;
					b = tempB;
					c = tempC;
					
					break;
				}
			}
		}

		int product = a * b * c;
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
		System.out.println("Product: " + product);
		
//		A: 375
//		B: 200
//		C: 425
//		Product: 31875000
		
	}

}
