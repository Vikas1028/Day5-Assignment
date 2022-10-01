import java.util.Scanner;

public class PowerOf2Table {

	public static void main(String[] args) {
		// b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows
		// an int
		Scanner inp = new Scanner(System.in);
		System.out.print("Takes a command-line argument N and N is 0 <= N < 31 = ");
		int powerOfTwo = inp.nextInt();
		int TableOfTwo = 1;
		// c. Logic -> repeat until i equals N.
		if (powerOfTwo == 0) {
			System.out.println(powerOfTwo + " power of 2 = " + 1);
		} else {
			for (int i = 1; i <= powerOfTwo; i++) {
				TableOfTwo = 1;
				for (int j = 1; j <= i; j++) {
					TableOfTwo = TableOfTwo * 2;
				}
				System.out.println(i + " power of 2 = " + TableOfTwo);
			}
		}
		inp.close();
	}
}
