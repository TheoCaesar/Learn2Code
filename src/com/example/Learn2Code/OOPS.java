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
	public static void basic() {
		Login session = new Login();
		
		//assign values via setter
		session.boDinWei("@axelson");
		session.typeCodeWei("123#Fro;");
		
		//fetch values via getters
		String sessionPassword = session.mamiPassword();
		String sessionUsername = session.hamiUsername();
		
		System.out.printf("Trying to login with %s - %s", sessionPassword, sessionUsername);
	}
}
