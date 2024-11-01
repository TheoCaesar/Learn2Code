package com.example.Learn2Code;
import java.util.Scanner;

public class Patterns {
	public static void square() {
		System.out.print("How many dimensions in grid: \t");
		Scanner userInput = new Scanner(System.in);
		int dim = userInput.nextInt();
		userInput.close();
		
		for (int row = 0; row < dim; row++) 
			for (int col = 0; col < dim; col++)
				System.out.print((col == dim-1)? "* \n": " * ");
		
		System.out.print("program closed...");
	}

	public static void steps() {
		System.out.print("Enter a number:\t");
		Scanner userInput = new Scanner(System.in);
		int number = userInput.nextInt();
		userInput.close();
		
		for (int row = 0; row <= number; row++) {
			for (int col = 0; col < row; col++)
				System.out.print("*");			
			System.out.println();
		}
	}
	
	public static void outline() {
		System.out.print("How many dimensions in grid: \t");
		Scanner userInput = new Scanner(System.in);
		int dim = userInput.nextInt();
		userInput.close();
		String marker = "";
		
		for (int row = 0; row < dim; row++) 
			for (int col = 0; col < dim; col++) {
				if (row == 0 || row == dim -1 || col == 0 || col == dim -1) {
					marker = "*";
					marker = (col == (dim-1)) ? marker + " \n" : " * ";
					System.out.print(marker);
				}
				else 
					System.out.printf("   ");
				}
		System.out.print("\n----------------------------------------\n");
		System.out.print("program closed...");
	}
}
