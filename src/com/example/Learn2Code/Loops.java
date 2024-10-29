package com.example.Learn2Code;

public class Loops{
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
	
}