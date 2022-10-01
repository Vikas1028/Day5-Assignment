import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// a. I/P -> Year, ensure it is a 4 digit number.
		Scanner inp = new Scanner(System.in);
		System.out.print("To Check Year is Leap Year or not Enter any 4 Digit Year = ");
		int year = inp.nextInt();
		if (year >= 999 && year < 10000) {
			// b. Logic -> Determine if it is a Leap Year.
			// c. O/P -> Print the year is a Leap Year or not.
			if (year % 4 == 0) {
				System.out.println(year + " is a Leap Year.");
			} else {
				System.out.println(year + " is not a Leap Year.");
			}

		}else {
			System.out.println("Enter Four Digit year");
		}
		inp.close();
	}
}
