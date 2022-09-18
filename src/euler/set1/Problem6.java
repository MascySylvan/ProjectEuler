package euler.set1;

public class Problem6 {

	public static void main(String[] args) {

//		Problem 6:
//		The sum of the squares of the first ten natural numbers is 385.
//		The square of the sum of the first ten natural numbers is 3025.
//		Hence the difference between the sum of the squares of the first ten natural numbers 
//		and the square of the sum is 3025 - 385 = 2640.
//		Find the difference between the sum of the squares of the first one hundred natural 
//		numbers and the square of the sum.
		
		//sum of the squares
		int sumOfTheSquares = 0;
		for (int i = 1; i <= 100; i++) {
			sumOfTheSquares += i * i;
		}
		
		//square of the sum
		int sum = 0;
		int squareOfTheSum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		squareOfTheSum = sum * sum;
		
		//diff
		int diff = sumOfTheSquares - squareOfTheSum;
		
		System.out.println("Difference: " + diff);
		System.out.println(sumOfTheSquares + " - " + squareOfTheSum + " = " + diff);
//		Difference: -25164150
//		338350 - 25502500 = -25164150
		
	}

}
