package com.drbhagwat.CoreJava.Chapter1;


/* 
 * What happens when you case a Double to an int that is larger than the 
 * largest possible int value. Try it out.
 */
public class Exercise5 {

  public static void main(String[] args) {
	int i =  (int) Double.MAX_VALUE;
	
	System.out.println("The largest double is " + Double.MAX_VALUE);
	System.out.println("The value of an int variable, when a double that is larger than the largest possibel int is cast to it, is" + i);
	System.out.println("The largest int value is " + Integer.MAX_VALUE);
  }
}
