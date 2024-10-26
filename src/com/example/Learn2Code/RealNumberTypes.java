package com.example.Learn2Code;

public class RealNumberTypes {
	public static void decimalPlaces(String[] args) {
			float floatdp = 0.12345678901234f;
			double dbldp = 0.1234567890123456789;
			
			System.out.println(floatdp);
			System.out.println(dbldp);
			System.out.printf("%, .2f", dbldp); //2 decimal places
	}
	
	public static void realnumbertypes(String[] args) {
		System.out.println("**************************************");
		System.out.println("Real (Decimal) Numbers Range Max-Min");
		System.out.println("**************************************");
		System.out.printf("Float: %f -> %f\n", Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf("Float: %d -> %d\n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);
		System.out.printf("Float: %d\n", Float.PRECISION);

		System.out.printf("\nDouble: %f,.4f -> %f,.4f\n", Double.MIN_VALUE, Double.MAX_VALUE);
		System.out.printf("Double: %d -> %d\n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
		System.out.printf("Double: %d\n", Double.PRECISION);
		
		
		float valFloat = Float.MAX_VALUE;
		float expFloat = Float.MAX_EXPONENT;
		
		double valDouble = Double.MAX_VALUE;
		double expDouble = Double.MAX_EXPONENT;

		System.out.println("\n**************************************");
		System.out.println("Real (Decimal) Numbers Range Max-Min");
		System.out.println("**************************************");
		System.out.printf("Float Max Value: %f\n", valFloat +=1 );
		System.out.printf("Float Exponent: %s\n", expFloat += 1);
		
		System.out.printf("\nDouble Max Value: %,.4f\n", valDouble += 1);
		System.out.printf("Double Exponent: %, .4f\n", expDouble += 1);



	}
}
