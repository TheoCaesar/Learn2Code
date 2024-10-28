package com.example.Learn2Code;
import java.util.Scanner;

public class Operators {
	public static void ternary() {
		Scanner ui = new Scanner(System.in);
		
		System.out.print("Enter your marks:\t");
		int marks = ui.nextInt();
		boolean isPass = marks >= 80;
		
		System.out.print(
				(isPass) ? "Student had a grade A" 
						: "Sorry you failed!");
		
		ui.close();
	}
	
	public static void basics() {
		int num1 =80,num2 = 100;
		double ans = (double)num1 /num2;
		
		System.out.printf("Addition: %d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("Subtraction: %d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("Multiplication: %d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("Division: %d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("Division - typecasting: %d / %d = %2f\n", num1, num2, (num1*1.0) / num2);
		System.out.printf("Division - forced typecasting: %d / %d = %2f\n", num1, num2, ans);
		System.out.printf("Addition: %d mod %d = %d\n", num2, num1, num2 % num1);		
	}
	
	public static void intermediate() {

		int num1 =80,num2 = 100, cpnum1 =0, cpnum2 = 0;
		System.out.printf("\nOur default values are - \n\tnum1: %d & num2: %d\n\tcpnum1: %d & cpnum2: %d\n\n", num1, num2, cpnum1, cpnum2);
		System.out.print("===================================\n\n");
		System.out.print("post-increment operation : cpnum1 = num1++\n");
		cpnum1 = num1++;
		
		System.out.print("post-decrement operation : cpnum2 = num2--\n");
		cpnum2 = num2--;
		System.out.printf("\nOur values post operations are - \n\tnum1: %d & num2: %d\n\tcpnum1: %d & cpnum2: %d\n\n", num1, num2, cpnum1, cpnum2);

		System.out.print("------------------------------------\n\n");

		num1 =80;num2 = 100; cpnum1 =0; cpnum2 = 0;
		System.out.printf("\nReset default values are - \n\tnum1: %d & num2: %d\n\tcpnum1: %d & cpnum2: %d\n\n", num1, num2, cpnum1, cpnum2);
		System.out.print("===================================\n\n");
		System.out.print("pre-increment operation : cpnum1 = ++num1\n");
		cpnum1 = ++num1;
		
		System.out.print("pre-decrement operation : cpnum2 = --num2\n");
		cpnum2 = --num2;
		System.out.printf("\nOur values post operations are - \n\tnum1: %d & num2: %d\n\tcpnum1: %d & cpnum2: %d\n\n", num1, num2, cpnum1, cpnum2);

	}
	
	public static void relational() {
		int val1 = 100, val2 = 200;
		
		System.out.print("Equality Operator(==)\n");
		System.out.print("========================\n");
		System.out.printf("%d == %d --> %b\n",val1, val2, val1==val2 );
		System.out.printf("%d == (%d/2) --> %b\n",val1, val2, val1==(val2/2));

		System.out.print("\nEquality Operator(==)\n");
		System.out.print("========================\n");
		System.out.printf("%d != %d --> %b\n",val1, val2, val1!=val2 );
		System.out.printf("%d != (%d/2) --> %b\n",val1, val2, val1!=(val2/2));
		
		System.out.print("\nGreater than or equal to Operator(>=)\n");
		System.out.print("=======================================\n");
		System.out.printf("%d >= %d --> %b\n",val1, val2, val1>=val2 );
		System.out.printf("%d >= (%d/2) --> %b\n",val1, val2, val1>=(val2/2));

		System.out.print("\nLess than or Equal to Operator(<=)\n");
		System.out.print("====================================\n");
		System.out.printf("%d <= %d --> %b\n",val1, val2, val1<=val2 );
		System.out.printf("%d <= (%d/2) --> %b\n",val1, val2, val1<=(val2/2));
		

		System.out.print("\nGreater than Operator(>)\n");
		System.out.print("=======================================\n");
		System.out.printf("%d > %d --> %b\n",val1, val2, val1>val2 );
		System.out.printf("%d > (%d/2) --> %b\n",val1, val2, val1>(val2/2));

		System.out.print("\nLess than Operator(<)\n");
		System.out.print("====================================\n");
		System.out.printf("%d < %d --> %b\n",val1, val2, val1<val2 );
		System.out.printf("%d < (%d/2) --> %b\n",val1, val2, val1<(val2/2));
	}
	
	public static void assignment() {
		int num1 =80,num2 = 100;
		double ans = 79/100.0;
		int mod = num2;
		
		System.out.printf("Subtraction: %d -= %d :--> %d\n", num1, num2, num1 -= num2);
		System.out.printf("Multiplication: %d *= %d :--> %d\n", num1, num2, num1 *= num2);
		System.out.printf("Addition: %d += %d :--> %d\n", num1, num2, num1 += num2);
		System.out.printf("Division - typecasting: %d /= %d :--> %2f\n", num1, num2, ans);
		System.out.printf("Modulus:  %d %s= %d :--> %d\n", num2, "%", num1, mod %= num1);		
	}
	
}
