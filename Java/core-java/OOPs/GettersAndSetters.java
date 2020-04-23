class Person {

	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name);
	}

	void calculateYearsToRetirement() {

		int retirmentAge = 60;
		int yearsLeft = retirmentAge - age;

		System.out.println("Years left " + yearsLeft); 
	
	}

	int calYearsRetire() {

		int retirmentAge = 60;
		int yearsLeft = retirmentAge - age;

		return yearsLeft;

	}

	int getAge() { //getter method

		return age;

	}

	void setAge(int age) { //setter method

		this.age = age;

	}

}

public class GettersAndSetters {

	public static void main(String args[]) {

		System.out.println("============================");
		System.out.println("Person 1 details:");

		Person person1 = new Person();

		person1.name = "Sam";
		person1.age = 35;

		person1.speak();
		person1.calculateYearsToRetirement();

		System.out.println("Years left for retirement is " + person1.calYearsRetire());

		System.out.println("============================");
		System.out.println("Preson 2 details");

		Person person2 = new Person();
		person2.name = "Jam";
		person2.setAge(40);

		System.out.println("My name is "+ person2.name + " and my age is " + person2.getAge());
		System.out.println("============================");

	}

}