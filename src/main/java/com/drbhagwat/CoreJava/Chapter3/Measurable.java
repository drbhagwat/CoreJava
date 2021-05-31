package com.drbhagwat.CoreJava.Chapter3;

/* 
 * Provide an interface Measurable with a method double getMeasure() that measures an object in some way. 
 * Make Employee implement Measurable. Provide a method double average(Measurable [] objects) that computes 
 * the average measure. USe it to compute the average salary of an array of Employees. 
 * Continue with the preceding exercise and provide a method Measurable largest(Measurable[] objects). Use it to 
 * find the name of the employee with the largest salary. Why do you need cast?
 */
public interface Measurable {
  public double getMeasure();
  
  public static double averageMeasurable(Measurable[] measurable) {
	return 0.0;
  }
  
  public static Measurable largest(Measurable[] measurable) {
	return null;
  }
}
