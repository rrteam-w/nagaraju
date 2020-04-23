import java.util.Scanner;

public class Switch {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a value between 1 and 10");

		int value = input.nextInt();

		switch(value) {

			case 1 : System.out.println("you entered value One"); break;
			case 2 : System.out.println("you entered value Two"); break;
			case 3 : System.out.println("you entered value Three"); break;
			case 4 : System.out.println("you entered value Four"); break;
			case 5 : System.out.println("you entered value Five"); break;
			case 6 : System.out.println("you entered value Six"); break;
			case 7 : System.out.println("you entered value Seven"); break;
			case 8 : System.out.println("you entered value Eight"); break;
			case 9 : System.out.println("you entered value Nine"); break;
			case 10 : System.out.println("you entered value Ten"); break;
			default: System.out.println("you entered a value other than between 1 and 10"); break;

		}


		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a command(start or stop): ");
		String val = in.nextLine();

		switch(val) {
			case "start": System.out.println("Machine Started...."); break;
			case "stop": System.out.println("Machine Stopped...."); break;
			default: System.out.println("Command not recognized"); break;
		}

	}

}