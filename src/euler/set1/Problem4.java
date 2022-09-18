package euler.set1;

import euler.commons.StringUtility;

public class Problem4 {

	public static void main(String[] args) {
		
//		Problem 4:
//		A palindromic number reads the same both ways. The largest palindrome made from 
//		the product of two 2-digit numbers is 9009 = 91 × 99.
//		Find the largest palindrome made from the product of two 3-digit numbers.
		
		int largestPalindrome = 0;
		int num1 = 0;
		int num2 = 0;
		
		for (int i = 999; i > 99; i--) {
			for (int k = 999; k > 99; k--) {
				int product = i * k;
				boolean pCheck = StringUtility.isPalindrome(product + "");
				
				if (pCheck && product >= largestPalindrome) {
					num1 = i;
					num2 = k;
					largestPalindrome = product;
				}
			}
		}

		System.out.println("Largest Palindrome: " + largestPalindrome);
		System.out.println(num1 + " x " + num2 + " = " + largestPalindrome);
//		Largest Palindrome: 906609
//		913 x 993 = 906609

	}

}
