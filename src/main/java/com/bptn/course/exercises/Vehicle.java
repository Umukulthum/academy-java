package com.bptn.course.exercises;

public class Vehicle {

	// declare instance variables- colour and brand
	String colour;
	String brand;

	Vehicle() {
		this("Black", "Tesla");
	}

	// add parameterized constructor
	Vehicle(String colour, String brand) {
		this.colour = colour;
		this.brand = brand;
	}

	public void print() {
		System.out.println(this.colour + " " + this.brand);
	}

	// Do not modify this code as we have parameters that pass the test case
	public static void main(String[] args) {
		Car car = new Car("White", "Audi", "Chromecoloured");
		Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
		System.out.println(car.colour + " " + car.brand + " " + car.steeringWheel);
		System.out.println(bike.colour + " " + bike.brand + " " + bike.bikeHandle);

	}

}

class Car extends Vehicle /* extends Vehicle */ {

	// instance variable
	String steeringWheel;

	// add parameterized constructor- use super keyword to call parent constructor
	public Car(String colour, String brand, String steeringWheel) {
		super(colour, brand);
		this.steeringWheel = steeringWheel;
	}

	@Override
	public void print() {
		super.print();
	}
}

class Bike extends Vehicle {

	// Declare an instance variable- String bikeHandle
	String bikeHandle;

	// add parameterized constructor- use super keyword to call parent constructor
	public Bike(String colour, String brand, String bikeHandle) {
		super(colour, brand);
		this.bikeHandle = bikeHandle;
	}

	@Override
	public void print() {
		super.print();
	}
}