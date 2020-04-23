import java.util.Scanner;

public class DoWhile {

	public static void main(String args[]) {

		int i = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number");

		int value = input.nextInt();

		System.out.println("You entered value: " + value);

		do {
			System.out.println("i value is : " + i);
			i = i + 1;
		}while(i < value);

		System.out.println("=========================");

		int val = 0;
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter a number");
			val = in.nextInt();
		} while(val != 5);

		System.out.println("Hurray !! Got 5");

	}

}