package com.drbhagwat.CoreJava.Chapter3;

import java.util.Arrays;
import java.util.Comparator;

/* 
 * Write a call to Arrays.sort that sorts employees by salary, breaking ties by name.
 * Use Comparator.thenComparing. Then do this in reverse order.
 */
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

  @Override
  public String toString() {
	return ("name is: " + name + " salary is: " + getMeasure());
  }

  public String getName() {
	return name;
  }

  public double getSalary() {
	return salary;
  }

  public static void main(String[] args) {
	Employee [] employees = new Employee[20];

	for (int i = 0; i < 20; i++) {
	  employees[i] = new Employee("Name", i * 1000.0);
	}
	System.out.println("The average salary of all emplyees: " + Employee.averageMeasurable(employees));
	System.out.println("The largest salary is drawn by: " + ((Employee) Employee.largest(employees)).getName());
	Arrays.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
	for (int i = 0; i < 20; i++) {
	  System.out.println(employees[i]);
	}
	Arrays.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed());
	
	for (int i = 0; i < 20; i++) {
	  System.out.println(employees[i]);
	}
  }
}
