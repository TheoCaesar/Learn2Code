package com.example.Learn2Code;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * ASCII CHART FOR STRING MANIPULATION
 * 0 -> Null;
 * 1-31 -> Control Keys
 * 32 -> Space;
 * 48-57 -> Numbers(0 - 9);
 * 65-90 -> Upper case (A - Z);
 * 97-122 -> lower case (a - z);
 * +32 upper to lower case
 */

public class Strings {
	public static void basics() {
		//mutable 
		String s1 = "hello";
		String s2 = "hello";
		System.out.printf("String s1 == String s2 ==>  %b\n",s1 == s2); //true (e) 
		
		//immutable - instantiation - creating new memory blocks
		String s21 = new String("hello");
		System.out.printf("String s1 == String s21 ==> %b\n" , s2 == s21); //false (e)
		
		//equals - string method to check contents rather than memory block 
		System.out.println("String s1.equals(s21) ==> " + s2.equals(s21)); //false (e)

	}
	
	public static void methods() {
		String s = "Learn 2 Code";
		
		System.out.printf("s[2] = %c\n", s.charAt(2));
		System.out.printf("index of letter 'e' in s = %d\n", s.indexOf("e"));
		System.out.printf("replace 'e' with 'i' in s = %s\n", s.replace("e","i")); //creates and updates a new copy
		System.out.printf("replace 'e' with 'i' in s = %s\n", s.replaceFirst("e","i")); //creates and updates a new copy
		System.out.printf("Our string contains 'earn'? %b\n",s.contains("earn"));
		System.out.printf("Our string starts with 'earn'? %b\n", s.startsWith("earn"));
		System.out.printf("Our string ends with 'earn'? %b\n", s.endsWith("earn"));

		System.out.printf("Our string is now %s\n\n", s);
		
		
		char []stoArray = s.toCharArray();
		for(int i = 0; i < s.indexOf(" "); i++)
			System.out.println(stoArray[i]);
		
//		System.out.println("\nKey in any string - phrase or sentence...");
//		Scanner console = new Scanner(System.in);
//		String userInput = console.next();
//		System.out.printf("Using Scanner's next method, your string is %s\n", userInput);
//
//		System.out.println("\nKey in a new string - phrase or sentence...");
//		Scanner console2 = new Scanner(System.in);
//		userInput = console2.nextLine();
//		System.out.printf("Using nextLine method, your string is %s", userInput);
//
//		console.close();		
//		console2.close();		
	}

	public static void mutable() {
		/**
		 * Illustrative mutability with string buffer;
		 */
		
		String s1 = "hello";
		
		
		StringBuffer sbS1 = new StringBuffer("hello");
		sbS1.append(" world");
		System.out.printf("1. sbS1.length() => %d\n",sbS1.length());
		System.out.printf("2a. sbS!.replace(6, 11, earth) => %s\n", sbS1.replace(6, 11, "earth")); //repl 6 (11-6) elem starting from index 6
		System.out.printf("2b. sbS1.insert() => %s\n",sbS1.insert(0, "looading..\n"));
		System.out.printf("3. sbS1.reverse() => %s\n",sbS1.reverse());
		System.out.printf("4. sbS1.delete(0, 3) => %s\n",sbS1.delete(0, 3)); // del 3(3 - 0 = 3) elements starting from index 0
	}

	public static void tokenizer() {
		 String s1 = "Tim is a naughty boy";
		 
		 StringTokenizer st = new StringTokenizer(s1, " ");
		 
		 //loop through tokens (substr)
		 while(st.hasMoreTokens()) 
			 System.out.println(st.nextToken());		 
	}

	public static void excercise() {
		/**
		 * Take a string from operator 
		 * and perform modifications to it
		 * if char element is upper case 
		 * return lower case and vice versa
		 */
		
//		Get input from operator
		Scanner console = new Scanner(System.in);
		System.out.println("Gimme a string...\n");
		String userInput = console.nextLine();
		
		//convert str to array
		char []arr = userInput.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			int newVal;
			if ((int) arr[i] >= 65 && (int) arr[i]<= 96)
				 newVal = (int) arr[i] + 32;
			else newVal = (int) arr[i] - 32;
			arr[i] = (char) newVal;
		}
		
		
		//convert arr to string;
		String finalStr = arr.toString();
		System.out.println(finalStr + "\n");
		
		StringBuffer sb = new StringBuffer();
		sb.append(arr);
		System.out.println(sb.toString());
		//try StringBuffer
		console.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	public static void excercise2() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a word in format a4b2c11d3\n");
		String userInput = console.next();
		
		char []arr = userInput.toCharArray();
		
		//loop through userInput and convert digits to numbers
		char letter = arr[0], digit=arr[1];
		int numeral =0;
		for (int i=0; i<arr.length; i++) {
			System.out.printf("\nLoop at index %d is %c",i , arr[i]);
			//check if element @index i is digit
			if ((int) arr[i] >= 48 && (int) arr[i] <=57) {
				System.out.println("\n\t(A) if a[i] is num");
				digit = arr[i];
				
				for (int j=i+1; j < arr.length ; j++ ) {
					if (j < arr.length && (int) arr[j] >= 48 && (int) arr[j] <=57)  {	
//						if (numeral > 0)
						numeral *= 10;
						numeral += (digit -48);
						digit = arr[j];
						System.out.printf("\n\t\t(A.i)if a[j] is num: %c\n", arr[j]);
						numeral *= 10;
						numeral += (digit -48);
						i = j;
					} else {
						System.out.printf("\n\t\t(A.ii) else a[j] is letter: %c\n", (j > arr.length) ? arr[j-1] : arr[j]);
						j = arr.length;
					}
					System.out.println("==> \n\t(A-ans)digit = " + digit + " numeral = " + numeral);
				}
			}
			else {
				System.out.println("\n\t(B) else a[i] is letter");
				letter = arr[i];
			}
			
			if (i == arr.length - 1)
				numeral = arr[i];
			while (numeral-- > 0) 
				System.out.printf("%c", letter);					
			numeral = 0;
		}
		console.close();		
	}
	
}







