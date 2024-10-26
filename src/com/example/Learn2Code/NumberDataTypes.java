package com.example.Learn2Code;

public class NumberDataTypes {
	public static void numberdatatypes() {
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("Data Type Range  - MIN -> MAX");
		System.out.println("+++++++++++++++++++++++++++++++\n");
		System.out.printf("byte:  %d ->  %d\n",Byte.MIN_VALUE,Byte.MAX_VALUE);
		System.out.printf("short:  %d ->  %d\n",Short.MIN_VALUE,Short.MAX_VALUE);
		System.out.printf("integer:  %d ->  %d\n",Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.printf("long: %d ->  %d\n",Long.MIN_VALUE,Long.MAX_VALUE);
		
		byte valByte = Byte.MAX_VALUE;  		//size of 8bits = 2^8 
		short valShort = Short.MAX_VALUE;		//size of 16bits = 2^16
		int valInt = Integer.MAX_VALUE;			//size of 32bits = 2^32 
		long valLong = Long.MAX_VALUE;			//size of 64bits = 2^64 
		
				
		// Looping of data types
		System.out.println("\n+++++++++++++++++++++++++++++++");
		System.out.println("Data Type looping");
		System.out.println("+++++++++++++++++++++++++++++++\n");

		System.out.println(valByte + 10);
		System.out.println(valShort + 1);
		System.out.println(valInt + 1);	
		System.out.println(valLong + 1);		
	
	
		//Looping with type casting
		System.out.println("\n+++++++++++++++++++++++++++++++");
		System.out.println("Data Type looping & typecasting");
		System.out.println("+++++++++++++++++++++++++++++++\n");
		System.out.println(valByte += 10);
		System.out.println(valShort += 1);
		System.out.println(valInt += 1);	
		System.out.println(valLong += 1);
	}
}
