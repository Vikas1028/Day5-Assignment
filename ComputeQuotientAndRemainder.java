import java.util.Scanner;

public class ComputeQuotientAndRemainder {

	public static void main(String args[]) {
		int divisor,divident,quotient,remainder;
		Scanner inp=new Scanner(System.in);
		System.out.print("Divident = ");
		divident=inp.nextInt();
		System.out.print("Divisor = ");
		divisor=inp.nextInt();
		quotient=divident/divisor;
		remainder=divident%divisor;
		System.out.println("Quotient = "+quotient);
		System.out.println("Remainder = "+remainder);
		inp.close();
	}
}
