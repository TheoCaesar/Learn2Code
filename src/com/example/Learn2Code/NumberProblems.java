package com.example.Learn2Code;
import java.util.Scanner;

public class NumberProblems {
	public static void prime() {
		/*
		 * a simple program that takes a number
		 * and tells operator if it is a prime number 
		 * or otherwise.
		 */
		System.out.print("Enter a number: \t");
		Scanner userInput = new Scanner(System.in);		
		int num = userInput.nextInt();
		userInput.close();

		int count = 0;
			
		for (int i = 1; i < num; i++) {
			int result = 0;
			for (int j = 1; j <= num; j++) {
				if (result > num || count > 2) break;
				else {
					result = i * j;
					count = (result == num) ? count+1 : count;
					System.out.printf("%d * %d = %d - count: %d\n", i, j, result, count);				
				}
			}
		}
		
		System.out.printf((count > 2) ? "%d is a prime number": "%d is not a prime number", num );
	}
	
	public static void perfectNumber() {
		/*
		 * a simple program to check if a 
		 * number is perfect or otherwise
		 * E.g. 1+2+3 = 6 is perfect 
		 * 3, 6, 10, 15, 21, 28, 36...
		 */
		
		System.out.printf("Enter a number: \t");
		Scanner userInput = new Scanner(System.in);
		int number = userInput.nextInt();
		userInput.close();
		
		int sum = 0;
		int i =1;
		do {
			if (sum == number) break;
			System.out.printf("sum = %d, i = %d\n", sum, i);
			sum += i;
			i++;		
		} while (sum <= number);
		
		System.out.printf((sum == number) ? "\n%d is a perfect number": "%d is not a perfect number", number);	
	}
}
