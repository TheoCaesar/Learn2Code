package com.example.Learn2Code;

public class OtherDataTypes {
	public static void bool_chars() {
		boolean isPass = 85 > 50;
		char grade = 'X';
		if (isPass) 
			grade =  97;
		else
			grade = 'F';
		System.out.printf("Student had grade %c", grade);
	}
}
