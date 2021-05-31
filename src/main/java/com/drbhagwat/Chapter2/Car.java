package com.drbhagwat.Chapter2;

/* 
 * Implement a class Car that models a car traveling along the x-axis, consuming 
 * gas as it moves. Provide methods to drive by a given number of miles, to add a 
 * given number of gallons to the gas tank, and to get the current distance from 
 * the origin and fuel level. Specify the fuel efficiency (in miles/gallon) in the
 * constructor. Should this be an immutable class? Why or why not?  
 */
class Car {
  private double milesDriven= 0.0;
  private double gallonsInTank = 0.0;
  private double efficiency = 0.0;
  
  public Car(double gallonsInTank, double efficiency) {
	this.gallonsInTank = gallonsInTank;
	this.efficiency = efficiency;
  }
  
  public void drive(double miles) {
	this.gallonsInTank -= (miles/getEfficiency());
	this.milesDriven += miles;
  }

  public double add(double numberOfGallons) {
	return (this.gallonsInTank += numberOfGallons);
  }

  public double getEfficiency() {
	return this.efficiency; 
  }

  public double getMilesDriven() {
	return this.milesDriven; 
  }

  public double getGallonsInTank() {
	return this.gallonsInTank; 
  }

  @Override 
  public String toString() {
	return (milesDriven + " miles driven. " +  
			gallonsInTank + " gallons left in the tank." 
		+ " and the efficiency is " + efficiency);
  }
  
  public static void main(String args[]) { 
	Car car = new Car(42, 10);
	car.drive(100);
	System.out.println(car);
	car.drive(100);
	System.out.println(car);
  }
}
