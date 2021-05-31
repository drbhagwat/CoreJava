package com.drbhagwat.Chapter1;

/* 
 * Improve the average method so it that it is called with at least one
 * parameter.
 */
public class Exercise16 {
  public static void main(String[] args) {
	double a[] = {};
	
	System.out.println(average(a));
  }

  private static double average(double a[]) {
	int len = a.length;
	
	if (len == 0) {
	  return 0.0;
	}
	
	double sum = 0.0;

	for (double v : a) {
	  sum += v;
	}
	return sum/len;
  }
}
