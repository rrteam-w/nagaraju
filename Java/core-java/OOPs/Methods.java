class Person {

	// Instance Variables
	String name;
	int age;

	// methods or subroutines
	void speak() {
		System.out.println("My name is " + name + " and my age is " + age);
	}
}

public class Methods {

	public static void main(String args[]) {

		Person person1 = new Person();
		person1.name = "Sam";
		person1.age = 37;
		person1.speak();

	}

}