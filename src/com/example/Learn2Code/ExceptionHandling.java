package com.example.Learn2Code;

class MarksException extends Exception{
	MarksException(String s){
		super(s);
	}
}

class Dummy{
	public void err() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public void doSomething() {
		try {
			err();
		} catch (Exception e) {
			System.out.print("\nException caught " + e);
		}
	}
}

public class ExceptionHandling {
	public static void throwsKeyword() {
		Dummy dum = new Dummy();
		dum.doSomething();
	}
	
	public static void throwKeyword() {
		int passMark = 80;
		int mark = 62;
		
		if (mark < passMark) {
			try {
//				int result = 62/0; //return ArithmeticException
				throw new MarksException("marks below avg...");
			} catch (MarksException eObj) {
				System.out.println("you failed...try again " + eObj);
			}
		} else {
			System.out.println("You passed...congrats");
		}
	}
	
	public static void example() {
		String []names = new String[5];
		try {
			names[5] = "timini";
		} catch(Exception eObj) {
			System.out.println("Something went wrong...\n" + eObj);
		}
		System.out.println("Program terminated successfully...");
	}
	
	public static void multiBlock() {
		int []arr = new int[5];
		try {
//			arr[5] = 10;  //return arrayIndexOutOfBoundsException
			int result = 10/0; //return ArithmeticException
			System.out.println("in between try & catch ");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.print(
				"we are trying to access an index beyond our array size...");
		} catch(Exception e) {
			System.out.println("This operation cannot be performed..." + e);
		}
		finally {
			System.out.println("\nProgram terminated successfully...");
		}
	}

	
}
