package euler.set1;

import java.util.LinkedList;
import java.util.List;

public class Problem2 {

	public static void main(String[] args) {

//		Problem 2:
//		Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
//		By starting with 1 and 2, the first 10 terms will be:
//
//		1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//		By considering the terms in the Fibonacci sequence whose values do not exceed four million,
//		find the sum of the even-valued terms.
		
		List<Integer> fibSeq = new LinkedList<Integer>();
		
		//generate fibSeq
		fibSeq.add(new Integer(1) );
		fibSeq.add(new Integer(2) );
		
		do {
			int prev1 = fibSeq.get(fibSeq.size() - 1).intValue();
			int prev2 = fibSeq.get(fibSeq.size() - 2).intValue();

			fibSeq.add(new Integer(prev1 + prev2) );
			
		} while (fibSeq.get(fibSeq.size() - 1).intValue() <= 4000000 );
		
		//sum of the even-valued terms
		int total = 0;
		
		for (int i = 0; i < fibSeq.size(); i++) {
			if (fibSeq.get(i).intValue() % 2 == 0) {
				total += fibSeq.get(i).intValue();
			}
		}
		
		System.out.println("Sum: " + total); //Sum: 4613732

	}

}
