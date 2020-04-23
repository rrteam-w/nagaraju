public class ForLoops {

	public static void main(String args[]) {

		int x;

		System.out.println("=================");

		for(x = 10; x > 0; ) {
			System.out.println("|x value is : " + x + " |");
			x = x - 1;
		}

		System.out.println("=================");

		for(int i = 0; i < 10; i++) {
			System.out.println("| i value is : " + i + " |");
		}

		System.out.println("=================");

		for(int j = 0; j < 10; j++) {
			System.out.printf("| j value is : %d |", j);
		}

		System.out.println("=================");

	}

}