package com.example.Learn2Code;
import java.util.Scanner;

public class Arrays {
	public static void basics() {
		//array declaration - new keyword
		int[] scores = new int[10];
		
		//array insertions
		scores[0] = 90;
		scores[1] = 83;
		scores[2] = 84;
		scores[3] = 64;
		scores[4] = 68;
		
		//accessing arrays with loop
		for (int i = 0; i < 5; i++) {
			System.out.printf("index %d or position %d => %d\n", i , i+1, scores[i]);
		}
		Scanner console = new Scanner(System.in);
		
		System.out.print("\nEnter your 5 remaining scores.\n");
		for (int i = 5; i < 10; i++) {
			System.out.printf("Scores[i] =>  ");
			scores[i] = console.nextInt();
		}
		console.close();
		
		System.out.println();
		//accessing arrays with loop
		for (int i = 0; i < 10; i++) {
			System.out.printf("index %d or position %d => %d\n", i , i+1, scores[i]);
		}
		
	}

	public static void insertion() {
		//declare array
		int [] scores = new int[200];
		
		//assign values to first 10;
		for (int i = 0; i < 10; i++)
			scores[i] = i*10;
		
		//display values in first 10;
		System.out.println("We have 10 scores now...");
		System.out.println("--------------------------");
		for (int i = 0; i < 10; i++)
			System.out.printf("Scores[%d] => %d\n", i, scores[i]);
		System.out.println();
		
		//now insert value within first 10 slots
		Scanner console = new Scanner(System.in);
		System.out.printf("What number would you like to add in first 10?\t");
		int num = console.nextInt();
		
		System.out.printf("In what index (0-9) do we assign the number %d?\t", num);
		int index = console.nextInt();
		
		System.out.printf("\nPreparing to put %d at index %d of array\n", num, index);
		
		int []rightScores = scores;
		
		for (int i = 9; i > index; i--) {
			System.out.printf("Moving %d from indx %d to indx %d\n",rightScores[i], i , i + 1);
			rightScores[i+1] = rightScores[i];
			
		}
		
		rightScores[index] = num;
		
		System.out.printf("\n\nRightfully Updataed array with %d at %d\n", num, index);
		for (int i = 0; i <= 10; i++)
			System.out.printf("Scores[%d] => %d\n", i, rightScores[i]);
		System.out.println();
	}
	
	public static void deletion() {
		int []scores = new int[200];
		
		Scanner console = new Scanner(System.in);
		System.out.print("How many blocks(1-200) in our array do you need?\t");
		int arrSize = console.nextInt();
		
		for (int i = 0; i < arrSize; i++)
			scores[i] = i*10;
		
		
		System.out.printf("Array of size %d init witth default values\n", arrSize);		
		for (int i = 0; i < arrSize; i++)
			System.out.printf("\tScores[%d] = %d\n", i, scores[i]);
		System.out.println();
		
		System.out.print("What index content do you need to delete? \t");
		int delIndex = console.nextInt();
		System.out.printf("\nPreparing to delete element %d in index %d /n", scores[delIndex], delIndex);

		console.close();
		
		for (int i = delIndex; i < arrSize; i++)
			scores[i] = scores[i + 1];
		scores[arrSize] = scores[arrSize  + 1];
		arrSize -=1;
		System.out.println();

		
		System.out.printf("Array of size %d init witth default values\n", arrSize);		
		for (int i = 0; i < arrSize; i++)
			System.out.printf("\tScores[%d] = %d\n", i, scores[i]);
		System.out.println();
		System.out.printf("\tScores[%d] = %d\n",arrSize + 1, scores[arrSize + 1]);

	}

	public static void searchByValue() {
		Scanner console = new Scanner(System.in);
		int[] scores = new int[100];
		System.out.print("How many elements(0-200) will be in your array?\t");
		int arrSize = console.nextInt();
		
		for (int i = 0; i < arrSize; i++)
			scores[i]= i * 10;
		System.out.println();
		
		for (int i = 0; i < arrSize; i++)
			System.out.printf("Scores[%d] = %d\n", i, scores[i]);		
		System.out.println();
		
		//find a value 2x with a loop
		for (int x = 0 ;x < 2; x++) {
			System.out.print("What value will you like to search for?\t");
			int searchval = console.nextInt();
			int searchIndex = -1;
			
			for (int i= 0; i < arrSize; i++) {
				if (scores[i] == searchval) {
					searchIndex = i;
					break;
				}
			}
			System.out.printf((searchIndex == -1) ? 
				"Value %d could not be found in our array" : 
					"Value %d found at index position %d", searchval, searchIndex);
			
			System.out.println();
			System.out.println();
		}		
	}

	public static void searchByIndex() {
		int []scores = new int[50];
		Scanner console = new Scanner(System.in);

		System.out.print("How many blocks in the array do you need? \t");
		int arrSize = console.nextInt();
		
		for (int i = 0; i < arrSize; i++)
			scores[i] = i*10;
		
		for (int i =0; i < arrSize ; i++)
			System.out.printf("\tScores[%d] = %d\n", i, scores[i]);
		System.out.println();
		
		int loopcount = 0;
		do {
			System.out.print("\nAt what index do you want the value retrieved?\t");
			int index = console.nextInt();
			System.out.println();
			
			System.out.printf((index > arrSize) ? 
					("==> %d is out of your range but Scores[%d] = %d\n"): 
						"==>\t Scores[%d] = %d\n", index, index, scores[index]);
			loopcount++;
		} while (loopcount < 2);		
		console.close();
	}

	public static void sortAscending() {
		//declare and init an array - curly braces
		int []scores = {5, 3, 8, 2, 4, 6, 1, 7, 9, 2};
//		int []scores = {5, 3, 8, 2, 4};
		int min, max, temp;
		
		for (int i = 0; i < scores.length - 1; i++)
			for (int j = i + 1; j <= scores.length-1; j++) {
				if (scores[i] > scores[j]) {
					temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				} else continue;
			}
		
		for(int i = 0; i < scores.length; i++)
			System.out.printf("Scores[%d] => %d\n", i, scores[i]);
	}
	
	public static void sortDesc() {
		//decl and init arr - curly braces (weird)
		int []scores = {5, 3, 8, 2, 4, 6, 1, 7, 9, 2};
		int max, min, temp;
		
		for(int first = 0; first < scores.length; first++) {
//			System.out.printf("Scores[%d] => %d\n", first, scores[first]);
			for (int next = first + 1; next < scores.length; next++) {
				if (scores[first] < scores[next]) {
					temp = scores[first];
					scores[first] = scores[next];
					scores[next] = temp;
//					System.out.printf("\tScores[%d] < scores[%d]\n", scores[first],  scores[next]);
				} else {
//					System.out.printf("\tScores[%d] < scores[%d]\n", scores[first],  scores[next]);
					continue;
				}
				
			}
//			System.out.printf("Scores[%d] is now ==> %d\n", first, scores[first]);
//			System.out.println();

		}
		System.out.println();
		for (int i = 0; i < scores.length; i++)
			System.out.printf("Scores[%d] => %d\n", i, scores[i]);
	}

	public static void top2least() {
		/*
		 * reduce time complexity of sorting 
		 * with just one loop rather than 
		 * nested loops.
		 */
		
		int []array = {-3, -2, -4,-4,  -5, -6};
//		int []array = {1, 5, 4, 2, 3};

		int least = array[0], secLeast = array[0];
		
		for (int i=0; i< array.length; i++) {
			System.out.printf("array[%d] vs least(%d)\n", array[i], least );
			if ( array[i] < least) {
				secLeast = (array[i] < secLeast ) ? least :  array[i+1];
				least = array[i];
//				if (secLeast == least) secLeast = array[i+1];
			} else if (array[i] < secLeast) {
				secLeast = array[i];
			};
			System.out.printf("\tLeast = %d, second least = %d\n", least, secLeast);
		}
	}

	public static void slidingWindow() {
		/*
		 * A simple function that takes an array of length n and 
		 * a range of x. we then loop's through its elements, taking 
		 * the value at each index in addition to the next x - 1 indices
		 * and print the largest value out of the x indices.
		 */
		int arrLength, argRange;
		Scanner console = new Scanner(System.in);
		
		System.out.print("How many elements in our array: \t");
		arrLength = console.nextInt();
		
		System.out.print("What's the size of our sliding window?: \t");
		argRange = console.nextInt();
		
		System.out.println("=====================================");
//		int[] array = {3, 5, 4, 8, 6, 7, 2, 9};
		int[] array = new int[arrLength];
		
		for (int i = 0; i < arrLength; i++) {
			System.out.printf("Enter element #%d: \t", i+1);
			array[i] = console.nextInt();
		}
			
		System.out.println("=====================================");

		int range = argRange;
		int max = array[0];
		
		for (int i = 0 ; i < arrLength; i++) {
			if (i + range > array.length) break;
			max = array[i];
			for (int j = i; j < i + range; j++) {
				if (max < array[j]) max = array[j];
				System.out.printf("%d: %d || ", j+1,array[j]);
			}
			System.out.printf("\tMax value is %d\n", max);
		}
		console.close();
	}

	public static void arrayRotations(int arrLength, int steps) {
		/*
		 * a simple function to take an array of length n
		 * and its elements from user inputs, we will take 
		 * another integer to signify the number of shifts
		 * index - 0 1 2 3 4
		 * in val- 1 2 3 4 5
		 * out val-4 5 1 2 3 
		 */
		System.out.println("Thought process #1");
		Scanner console = new Scanner(System.in);

		int []array = {1, 2, 3, 4, 5}; 
		int []modArray = new int[arrLength];
		for (int i = 0; i < array.length; i++) {
			System.out.printf("\t%d mod %d = %d\n", i, arrLength, i % arrLength);
		}
		
		System.out.println();
		System.out.println("Thought process #2");
		for (int i = 0; i < array.length; i++) {
			int result =  (i % arrLength) +2;
			System.out.printf("\t%d(index %d + step %d) mod %d = %d\n", i + steps,i, steps, arrLength,(result > arrLength - 1) ? result % arrLength: result);
		}
		
		System.out.println("\n");
		System.out.println("Thought process #3");
		for (int i =0; i< arrLength; i++) {
			System.out.printf("%d", arrLength);
			int newIndex = (i % arrLength) +2;
			int modIndex = (newIndex > arrLength -1) ? newIndex % arrLength : newIndex;
			System.out.printf("\tmodArray[%d] takes array[%d]\n", i, modIndex);
			modArray[i] = array[modIndex];			
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d, ", modArray[i]);
		}
		
		System.out.println("\n");
		System.out.println("Thought process #4");
		for (int i =0; i< arrLength; i++) {
			System.out.printf("%d", arrLength);
			int newIndex = (i % arrLength) +2;
			int modIndex = (newIndex > arrLength -1) ? newIndex % arrLength : newIndex;
			System.out.printf("\tmodArray[%d] takes array[%d]\n", modIndex, i);
			modArray[modIndex] = array[i];			
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d, ", modArray[i]);
		}
		console.close();
	}

	public static void minSwap(int arrSize, int searchValue) {
		int []array = {2, 5, 3, 4, 9, 7, 1 ,6};
		int left = 0, right = arrSize-1, count = 0;
		
		while (left < right) {
			while (array[left] < searchValue)
				left++;
			
			while (array[right] > searchValue)
				right--;
			
			if (array[left] == searchValue && array[right] == searchValue) 
				break;
			count++;
			left++; right--;
		}
		System.out.println("\nCount is " + count);
	}

	public static void multiDim() {
		//array init = instance of array
		Scanner  console = new Scanner(System.in);
		int [][]array = new int [5][2];
		
		//array const
		int [][]constArr = {
			{1, 2},
			{3, 4},
			{5, 6},
			{7, 8},
			{9, 10}
		};
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Array index %d\n", i);
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("\tindex #%d => ", j);
				array[i][j] = console.nextInt();
			}
			System.out.println();
		}
		console.close();
	}
}
















