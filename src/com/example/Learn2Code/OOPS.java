package com.example.Learn2Code;

class Parent {
	public Parent() {
		System.out.println("Hello from the Parent Class");
	}
	
	public void doSomething() {
		System.out.println("Lets go grocery shopping...");
	}
}

class Child extends Parent {
	public Child() {
		System.out.println("Hello from the Child Class");
	}
	
	public void makeSomething() {
		System.out.println("Let's get cooking...");;
	}
}

class GrandChild extends Child {
	public GrandChild() {
		System.out.println("Grand baby in the house!!!");
	}
	
	public void doNothing() {
		System.out.println("zzzzz....");
	}
}

class Uncle {
	public Uncle() {
		System.out.println("Hello from the Uncle Class");
	}
	
	public void doSomething() {
		System.out.println("Lets go grocery shopping...");
	}
}

class Niece extends Uncle {
	public Niece() {
		System.out.println("Hello from the Niece Class");
	}
	
	public void makeSomething() {
		System.out.println("Let's get cooking...");;
	}
}

class Nephew extends Uncle {
	public Nephew() {
		System.out.println("Hello from Nephew!!!");
	}
	
	public void doNothing() {
		System.out.println("zzzzz....");
	}
}

class Abusua {
	public Abusua() {
		System.out.println("I approve this union");
	}
}
// hierarchical inheritance() 
class Father extends Abusua { //simple
	public Father() {
		System.out.println("Head of house");
	}
}
//hierarchical
class Mother extends Abusua { //simple
	public Mother() {
		System.out.println("Support system...");
	}
}

//multiple
//class Son extends Father,Mother {
//	public Son() {
//		System.out.println("Last baby...");
//	}
//}



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

class Login {
	private String userName;
	private String password;
	
	//get password - by convention getter must have 'get' in name;
	public String mamiPassword() {
		return this.userName;
	}

	//get password
	public String hamiUsername() {
		return this.password;
	}
	
	//set userName - conventionally have set in setter
	public void boDinWei(String username) {
		this.userName = username;
	}
	
	//set password
	public void typeCodeWei(String password) {
		this.password = password;
	}
}

public class OOPS {
	public static void basics() {
		
		Dog pero = new Dog("husky", 8);
		
		System.out.printf("Dog is a %s of %d years old\n"
				, pero.breed, pero.age);
		
	}
	
	public static void inheritance() {
		Uncle wofa = new Uncle();
		
		Niece bbyGirl = new Niece();
		
		Nephew bbyBoy = new Nephew();
		
		//child classes access parent method
		bbyGirl.doSomething();
		bbyBoy.doSomething();
		
//		Parent daddy = new Parent();
//		Child tim = new Child();
//		
//		System.out.println("\n\n");
//		daddy.doSomething(); //parent method
//		
//		tim.doSomething();	//child access parent method
//		tim.makeSomething();	//child access method
//		
//		System.out.println("\nGrandChild things...\n\n");
//		//grand child access all levels of inheritance
//		GrandChild timini = new GrandChild();
//		timini.doSomething();
//		timini.makeSomething();
//		timini.doNothing();
	}
	
	public static void encapsulation() {
		Login session = new Login();
		
		//assign values via setter
		session.boDinWei("@axelson");
		session.typeCodeWei("123#Fro;");
		
		//fetch values via getters
		String sessionPassword = session.mamiPassword();
		String sessionUsername = session.hamiUsername();
		
		System.out.printf("\nTrying to login with %s - %s",
				sessionPassword, sessionUsername);
	}
}
