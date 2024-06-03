package euler.set2;

import java.util.List;

import euler.commons.GenericUtility;

public class Problem12 {

    public static void main(String[] args) {
		int triangle = 1;

        while (true) {
            int triangleNumber = 0;
            for (int i = 1; i <= triangle; i++) {
                triangleNumber += i;
            }
            
            List<Long> divisors = GenericUtility.getUniqueFactors(triangleNumber);

            if (divisors.size() >= 5) {
                System.out.println("Triangle: " + triangle);
                System.out.println("Triangle Number: " + triangleNumber);
                System.out.println("Number of Divisors: " + (divisors.size()));
                break;
            } else {
                triangle++;
            }
        }
    }
    
}
