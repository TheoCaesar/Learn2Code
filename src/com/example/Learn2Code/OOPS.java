package com.example.Learn2Code;

class Dog {
	String breed;
	int age;
	boolean isMale;
	
	//parameterized constructors
	public Dog(String breed, int age) {
		System.out.println("New Dog object created...\n");
		this.breed = breed;
		this.age = age;		
	}
}

public class OOPS {
	public static void basic() {
	
		Dog pero = new Dog("husky", 8);	
		
		System.out.printf("Dog is a %s of %d years old\n"
				, pero.breed, pero.age);
	}
}
