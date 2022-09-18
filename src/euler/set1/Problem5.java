package euler.set1;

public class Problem5 {

	public static void main(String[] args) {
		
//		Problem 5:
//		2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//		What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
		
		int i = 1;
		while (true) {
			boolean cont = false;
			for (int k = 1; k <= 20; k++) {
				if (i % k != 0) {
					cont = true;
					break;
				}
			}
			
			if (cont) {
				i++;
			} else {
				break;
			}
		}
		
		System.out.println("Smallest Positive Number: " + i); //Smallest Positive Number: 232792560
		
	}

}
