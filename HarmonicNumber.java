import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// b. I/P -> The Harmonic Value N. Ensure N != 0
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter Harmonic Value N = ");
		int harmonicNumber = inp.nextInt();
		double harmonicNumberValue = 0;

		if (harmonicNumber > 0) {
			for (double i = 1; i <= harmonicNumber; i++) {
				harmonicNumberValue = harmonicNumberValue + (1 / i);
			}
			System.out.println(harmonicNumber + "th Harmonic value = " + harmonicNumberValue);
		} else {
			System.out.println("Enter Harmonic Value > 0");
		}
		inp.close();
	}
}
