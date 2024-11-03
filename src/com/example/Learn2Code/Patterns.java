package com.example.Learn2Code;
import java.util.Scanner;

public class Patterns {
	public static void pyramid(int base) {
//		for (int i= 1; i <= base; i++) {
//			if (i%2 == 0) continue;
			int num = base;
			int maxrows = (num + 1)/2;
			int maxcols = (maxrows * 2) - 1;
			int numOfSpaces = 0;
			int symStartIndex = 0, symEndIndex = 0;
			boolean useSymbol = false;
		
			System.out.printf("Pyramid with base %d\n", num);
			System.out.printf("Pyramid with max rows %d\n", maxrows);
			System.out.printf("Pyramid with max cols %d\n", maxcols);
			System.out.println();
			
			for (int row = 1; row <= num; row++) {
				if (row % 2 == 0) continue;
				numOfSpaces = num - row;
				
//				System.out.printf("Row #%d wf %d * 4rm %d to %d\t\t", row, numOfSpaces, symStartIndex, symEndIndex);
				
				for (int col=1; col <= num; col++) {
					symStartIndex = (numOfSpaces/2) +1;
					symEndIndex = num - (numOfSpaces/2);
					useSymbol = (col >= symStartIndex && col <=symEndIndex) ? true : false;
					System.out.printf((useSymbol) ? " * " : "   ");
				}
//				System.out.printf("\nRow #%d wf %d spaces & '*'s 4rm %d to %d\t\t", row, numOfSpaces, symStartIndex, symEndIndex);

				System.out.println();
			}	
			System.out.printf("Pyramid with %d spaces from %d to %d\n", numOfSpaces, symStartIndex, symEndIndex);
			System.out.println("---------------------------------------");
//		}
	}

	public static void squareX(int dim) {
		int num = dim;

		for (int row = 1; row <= num ;row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print((row == col || row + col == 6) ? " * " : "   ");
//				System.out.print((row + col == 6) ? "| * |" : "|   |");
			} 
		
			System.out.println();
		}
	}
	
	
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
	
	public static void stepsReflectX() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number: \t");
		int num = userInput.nextInt();
		userInput.close();
		
		for(int row = 1; row <= num; row++) {
			System.out.printf("%d - ",row);
			for(int col=num; col>=row; col--) {
				if (col >= row)
					System.out.print("*");
				else System.out.print("-");
			}
			System.out.println();
		}
			
	}
	
	public static void stepsReflectY() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number: \t");
		int num = userInput.nextInt();
		userInput.close();

		for(int row = 1; row <= num; row++) {
			int numofSpaces = num - row;
			for(int col=1; col<=num; col++) {
				if (col <= numofSpaces)
					System.out.print("   ");
				else System.out.print(" *    ");
			}
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
