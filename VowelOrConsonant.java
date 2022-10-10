import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		String Character;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter any Alphabate : ");
		Character=inp.next();
		Character=Character.toUpperCase();
		System.out.println(Character);
		if(Character=="A" || Character=="E" || Character=="I" || Character=="O" || Character=="U") {
			System.out.println("Entered Alphabate is a Vowel.");
		}else {
			System.out.println("Entered Alphabate is a Consonant.");
		}
		inp.close();
	}
}
