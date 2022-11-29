package com.acc.polymorphism;

class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Car extends Vehicle {
	void run() {
		System.out.println("Car is running");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.run();
	}

}
