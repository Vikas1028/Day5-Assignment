import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String args[]) {
		int a;
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter any number a = ");
		a=inp.nextInt();
		if(a==0) {
			System.out.println(a+" is not even and not odd.");
		}else if(a%2==0) {
			System.out.println(a+" even number.");
		}else {
			System.out.println(a+" odd number.");
		}
		inp.close();
	}
}
