class Person {

	// Instance variables(data or state)
	String name;
	int age;

	// Classess contain Variables(Data) and Methods(Routines)
	// 1. Data
	// 2. Subroutines (methods)

}


public class ClassAndObjects {

	public static void main(String args[]) {

		Person person1 = new Person();
		person1.name = "Sam";
		person1.age = 35;

		Person person2 = new Person();
		person2.name = "Jam";
		person2.age = 28;

		
		System.out.println("I am " + person1.name + " with age of " + person1.age);	

	}

}