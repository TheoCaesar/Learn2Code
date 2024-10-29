package com.example.Learn2Code;

public class Loops{
	public static void forLoop() {
		System.out.println("Rocket Ship Countdown - for loops");
		System.out.println("----------------------------------");
		System.out.println("Lift off in:");
		
		for (int i = 10; i >=0 ; i--) {
			System.out.printf((i == 0) 
					? "\tWe have lift off !!!" 
							: "\t%d \n",i);
		}
	}
	
	public static void doWhileLoop() {
		int countdown = 10; // init flag
		
		System.out.println("Rocket Ship Countdown");
		System.out.println("------------------------");
		System.out.println("Lift off in:");
		
		//chunk of code to carry out once and subsequently based on condition
		do {
			System.out.printf((countdown == 0) 
					? "\tWe have lift off !!!" 
							: "\t%d \n", countdown--);
		} while (countdown >= 0);	//check condition
	}
	
	public static void whileLoop() {
		//initialize flag
		int start = 10;
		
		System.out.println("\nRocket Ship Countdown");
		System.out.println("-----------------------");
		System.out.println("Lift off in:");
		
		//check flag
		while (start >= 0) { 
			if (start == 0)
				System.out.println("We have liftoff !!!");
			else System.out.printf("\t %d\n", start);
			
			//update flag
			start--;
		}		
	}
	
	public static void test1() {
		int input = 12345;
		int a = input;
		int remainder = 0;
		int newValue = 0;

		
		while (a > 0) {
			remainder = a % 10;			
			newValue = newValue * 10 + remainder;
			System.out.printf("a: %d - remainder: %d - new value: %d\n", a, remainder, newValue);
			a /= 10;
		}
		System.out.println("\n-----------------------------------------\n");
		System.out.printf("a: %d - remainder: %d - new value: %d\n", a, remainder, newValue);
  
	}
	
	public static void test2() {
		/**
		 * A simple program that takes an input
		 * and then switches the values within odd
		 * positioned place values by reversing with 
		 * equivalents from the end
		 * E.g.: 1234567 becomes 7254361
		 * */
		
		int input = 1234567;
		int a = input;
		int count = 0;
		
		//establish count(place value of inputs);
		while (a > 0) {
			a /= 10;
			count++;
			System.out.printf("%d - count: %d\n", a, count);
		}
	}
	
	
}