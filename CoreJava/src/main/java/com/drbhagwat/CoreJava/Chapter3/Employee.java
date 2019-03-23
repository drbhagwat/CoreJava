package com.drbhagwat.CoreJava.Chapter3;

public class Employee implements Measurable {
  private double salary;
  private String name;
  
  @Override
  public double getMeasure() {
	return salary;
  }
  
  public static double averageMeasurable(Measurable[] measurable) {
	double sum = 0;
	int len = measurable.length;
	
	if (len == 0) {
	  return 0.0;
	}
	
	for( int i = 0; i < len; i++) {
	  sum += measurable[i].getMeasure();
	}
	return sum/measurable.length;
  }

  public static Measurable largest(Measurable[] measurable) {
	int len = measurable.length;
	
	if (len == 0) {
	  return null;
	}
	
	Measurable largest = measurable[0];
	
	for( int i = 1; i < len; i++) {
	  
	  if (measurable[i].getMeasure() > largest.getMeasure()) {
		largest = measurable[i];
	  }
	}
	return largest;
  }
  
  public Employee(String name, double salary) {
	this.name = name;
	this.salary = salary;
  }

  public String getName() {
	return name;
  }

  @Override
  public String toString() {
	return ("name is: " + name + " salary is: " + getMeasure());
  }

  public static void main(String[] args) {
	Employee [] employees = new Employee[20];

	for (int i = 0; i < 20; i++) {
	  employees[i] = new Employee(Integer.toString(i), i * 1000.0);
	}
	
	for (int i = 0; i < 20; i++) {
	  System.out.println(employees[i]);
	}
	
	System.out.println("The average salary of all emplyees: " + Employee.averageMeasurable(employees));
	System.out.println("The largest salary is drawn by: " + ((Employee) Employee.largest(employees)).getName());
  }
}
