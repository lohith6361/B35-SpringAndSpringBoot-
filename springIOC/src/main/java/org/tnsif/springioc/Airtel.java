package org.tnsif.springioc;
//to demonstrate a program on spring IOC
//implementable class for Sim Interface
public class Airtel implements Sim{

	
	
	public Airtel() {
		System.out.println("Airtel Class Constructor");
	}

	public void call() {
		System.out.println("I am using airtel calling");
		
	}

	public void data() {
		System.out.println("I am using airtel data");
		
	}

}
