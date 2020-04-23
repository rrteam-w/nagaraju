import java.util.Scanner;

public class GetUserInput {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your fav text :");

		String text = input.nextLine();

		System.out.println("You entered : " + text);

		System.out.println("Enter your fav int :");

		int iValue = input.nextInt();

		System.out.println("You entered value : " + iValue);

		System.out.println("Enter your fav float value :");

		float fValue = input.nextFloat();

		System.out.println("You entered value : " + fValue);

	}

}