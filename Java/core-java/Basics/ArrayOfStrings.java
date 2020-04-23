public class ArrayOfStrings{

	public static void main(String args[]) {

		String[] words = new String[3];

		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";

		System.out.println(words[0] + " " + words[1] + " " + words[2]);

		System.out.println("=====================");

		String[] fruits = {"apple", "banana", "mango", "grapes"};

		for(String fruit: fruits) {
			System.out.println(fruit);
		}

		System.out.println("=====================");

		String text = null;
		System.out.println("text");

		System.out.println("=====================");

		String[] texts = new String[2];
		System.out.println(texts[0]);

		System.out.println("=====================");

		texts[0] = "one";
		texts[1] = "two";

		for(int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}

		System.out.println("=====================");
	}

}