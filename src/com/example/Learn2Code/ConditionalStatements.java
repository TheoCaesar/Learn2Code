package com.example.Learn2Code;
import java.util.Scanner;

public class ConditionalStatements {
	public static void ifStatement() {
		int age = 0;
		Scanner userInput = new Scanner(System.in);
		System.out.print("How old are you?\t");

		age = userInput.nextInt();
		userInput.close();

		if (age < 18) {
			System.out.print("User is too young to vote");
		}
		System.out.print("\nProgram terminated...");
	}
	
	public static void ifElseStatement() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How old are you?:\t");
		int age = userInput.nextInt();
		userInput.close();
		
		if (age < 18) 
			System.out.print("Sorry you're not eligible\n");
		else 
			System.out.print("Great you can vote\n");
		userInput.close();
		System.out.print("Program Terminated...");
	}
	
	public static void ifElseIfStatement() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How old are you?:\t");
		int age = userInput.nextInt();
		userInput.close();
		
		if (age < 18) 
			System.out.print("Sorry you're not eligible\n");
		else if (age > 18 && age < 60 )
			System.out.print("Great, Do you love your job?\n");
		else 
			System.out.print("Happy Retirement");
		
		System.out.print("Program Terminated...");
	}
	
	public static void assignment() {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Leap Year Checker\n");
		System.out.print("==========================\n");			
		System.out.print("Enter any year at all:\t");
		
		int year = userInput.nextInt();
		
		if (year == 0 || year > 9999)			
			System.out.print("Please enter a valid year between 0 and 10000\n");		
		else if (year % 4 == 0)
			System.out.print("Leap year !!!");
		else if (year % 100 == 0) {
			if (year % 400 !=0)
				System.out.print("\tNot a (century) leap year");
			else System.out.print("\tA century leap year");
		}
		else 
			System.out.print("Something went wrong");
		
		userInput.close();
		System.out.print("\n\n-------------------------------------------\n");			
		System.out.print("Program terminated...\t");
	}
}