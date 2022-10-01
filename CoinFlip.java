
import java.util.Scanner;
import java.util.Random;

public class CoinFlip {

	public static void main(String[] args) {
		Random num = new Random();

		// a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
		Scanner inp = new Scanner(System.in);
		System.out.print("The number of times to Flip Coin = ");
		int userInput = inp.nextInt();
		double percentage = 100 / userInput, Head = 0, Tail = 0;

		if (userInput > 0) {

			for (int i = 1; i <= userInput; i++) {

				// b. Use Random Function to get value between 0 and 1. If < 0.5 then tails or
				// heads
				Double randomNumber = num.nextDouble(1);
				if (randomNumber > 0.5) {
					Head = Head + percentage;
				} else {
					Tail = Tail + percentage;
				}
			}

		} else {
              System.out.println("Enter Positive Integer");
		}
         //c. O/P -> Percentage of Head vs Tails
		System.out.println("Percentage of Head = " + Head);
		System.out.println("Percentage of Tail = " + Tail);
		inp.close();
	}

}
