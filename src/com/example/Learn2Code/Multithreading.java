package com.example.Learn2Code;

import java.util.Random;

class SCBAtm extends Thread {
	//override Thread.run
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(	i + "- " + this.getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Something went wrong..." + e);
			}
		}
	}
	
}

class CBE implements Runnable {
	public void run() {
		for (int i=0; i < 5; i++) {
			try {
				System.out.println(i + "-" +  Thread.currentThread().getName());
			} catch (Exception e) {
				System.out.println("Something went wrong..." + e);
			}
		}
	}
}

class VIP extends Thread {
	private String name;
	private int tickets;
	private static int availableTickets = 10;
	
	public VIP(String username, int tickets) {
		this.name = username;
		this.tickets = tickets;
		System.out.println("NB: Available tickets : " + this.availableTickets);
	}
	
	private static synchronized boolean book(String name, int tickets) {
		System.out.println("NB:--> Available tickets : " + availableTickets);

		if (tickets <= availableTickets) {
			System.out.println("\t>>> " + name + " succesfully booked " + tickets + " tickets");
			availableTickets -= tickets;
			return true;
		} else {
			System.out.println("\tXXX " + name  + " request was denied for booking " + 
					tickets + " tickets...");
			return false;
		}
	}
	
	public void run() {
		book(this.name, this.tickets);
	}
}

class Passenger {
	Passenger() {
		VIP passenger;
		for (int i = 1; i <= 10; i++) {
			Random randomValue = new Random();
			//random value btn 0 & 4
			int numOfTickets = randomValue.nextInt(4) + 1; 
			passenger = new VIP("passenger#" + i, numOfTickets);
			passenger.start(); //trigger thread
		}
	}
}


public class Multithreading {
	public static void sync() {
		new Passenger();
	}
 	public static void threadStart() {
		SCBAtm atmOne = new SCBAtm();
		SCBAtm atmTwo = new SCBAtm();
		
		//assign thread names
		atmOne.setName("Atm one");
		atmTwo.setName("Atm two");
		
		//start threads wf thread.run
		atmOne.start();
		atmTwo.start();
	}
	
	public static void runnable() {
		//interface instantiation
		Runnable accra = new CBE();
		Runnable kumasi = new CBE();
		
		//CBE instantiation
		CBE kpone = new CBE();
		
//		convert runnable to thread
		Thread t1 = new Thread(accra);
		Thread t2 = new Thread(kumasi);
		Thread t3 = new Thread(kpone);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			System.out.println("\t--> Interrupted exception e"  + e);
		}
		
		
		System.out.println("hello, post threads...");
		System.out.println(
			"Thread count => " + Thread.activeCount());		
	}
}
