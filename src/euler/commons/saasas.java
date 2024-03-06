package euler.commons;

import java.util.Random;

public class saasas {
	public static void main(String[] args) throws Exception {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {

            char l1 = (char) (random.nextInt(26) + 'a');
            char l2 = (char) (random.nextInt(26) + 'a');
            int randomNumber = random.nextInt(9000) + 1000;

            System.err.println("prnt.sc/" + l1 + l2 + randomNumber);
        }
    }
}
