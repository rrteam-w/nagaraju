public class Arrays {

	public static void main(String args[]) {

		int value = 7;

		int[] values;
		values = new int[3];

		System.out.println(values[0]);

		System.out.println("=======");

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;

		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		System.out.println("=======");

		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}

		System.out.println("=======");

		int[] numbers = {5, 6, 7}; //assigning values as list
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}